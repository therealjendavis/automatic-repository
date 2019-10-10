package com.example.rumbleapp2020;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import java.util.Objects;

public class Settings extends AppCompatActivity {

    public DeepSpace getSpace() {
        return (DeepSpace) getIntent().getSerializableExtra("Game");
    }
    private boolean cache = false;
    private boolean local = false;
    private boolean help = false;
    public static String dialogMessage;
    public boolean isCache() {
        return cache;
    }
    public void setCache(boolean cache) {
        this.cache = cache;
    }
    public boolean isLocal() {
        return local;
    }
    public void setLocal(boolean local) {
        this.local = local;
    }
    public boolean isHelp() {
        return help;
    }
    public void setHelp(boolean help) {
        this.help = help;
    }

    public String stringMe(String[] array) {
        StringBuilder stringValue = new StringBuilder(" ");
        for (String s : array) {
            stringValue.append(s);
        }
        return stringValue.toString();
    }
    public void clickedMe() {
        setCache(false);
        setLocal(false);
        setHelp(false);
    }
    public void updateTextView(String content, int id){
        TextView nametext = findViewById(id);
        nametext.setText(content);
    }
    private void displaySet(String[][] array) {
        getSpace().setSettingsDisplay(stringMe(array[getSpace().getSettingsDisplayNum()]));
        updateTextView(getSpace().getSettingsDisplay(), R.id.display);
    }
    public static class Dialogs extends DialogFragment {
        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder name = new AlertDialog.Builder(Objects.requireNonNull(getActivity()));
            name.setMessage(dialogMessage)
                    .setNegativeButton(R.string.okiedokes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Objects.requireNonNull(Settings.Dialogs.this.getDialog()).dismiss();
                        }
                    });
            return name.create();
        }
    }
    public void makeADialog(final String message, final String tag) {
        dialogMessage = message;
        DialogFragment newFragment = new Settings.Dialogs();
        newFragment.show(getSupportFragmentManager(), tag);
    }

    public void cacheButton(View view) {
        getSpace().setSettingsDisplayNum(0);
            displaySet(getSpace().getCacheArray());
            clickedMe();
            setCache(true);
    }
    public void localButton(View view) {
        getSpace().setSettingsDisplayNum(0);
        if (getSpace().getLocalArray()[0] != null) {
            displaySet(getSpace().getLocalArray());
            clickedMe();
            setCache(true);
        }
        else getSpace().setSettingsDisplay("No data available!"); updateTextView(getSpace().getSettingsDisplay(), R.id.display);
    }
    public void helpButtonTwo(View view) {
        getSpace().setSettingsDisplayNum(0);
        getSpace().setSettingsDisplay(getSpace().getSettingsHelpInfo());
        updateTextView(getSpace().getSettingsDisplay(), R.id.display);
        clickedMe();
        setHelp(true);
    }
    public void nextButton(View view) {
        getSpace().setSettingsDisplayNum(getSpace().getSettingsDisplayNum() + 1);
        if (isCache()) {
            if (getSpace().getCacheArray()[getSpace().getSettingsDisplayNum()] != null) {
                displaySet(getSpace().getCacheArray());}
            else makeADialog("No more data is available!", "nomoredata");}
        else if (isLocal()) {
            if (getSpace().getLocalArray()[getSpace().getSettingsDisplayNum()] != null) { displaySet(getSpace().getLocalArray());}
            else makeADialog("No more data is available!", "nomoredata");}
        else if (isHelp()) {
            makeADialog("No more data is available!", "nomoredata");}
    }
    public void clearButton(View view) {
        getSpace().setSettingsDisplay("");
        updateTextView(getSpace().getSettingsDisplay(), R.id.display);}
    public void submitButtonTwo(View view) {}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }
}
