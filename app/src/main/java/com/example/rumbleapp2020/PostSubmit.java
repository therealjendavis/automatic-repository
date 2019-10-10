package com.example.rumbleapp2020;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PostSubmit extends AppCompatActivity {
    public DeepSpace getSpace() {
        return (DeepSpace) getIntent().getSerializableExtra("Game2");
    }

    private void updateTextView(String content, int id){
        TextView nametext = findViewById(id);
        nametext.setHint(content);
        nametext.setText(content);
    }

    private void info() {
        updateTextView(getSpace().getMainName(), R.id.name);
        updateTextView(getSpace().getMainAlliance(), R.id.alliance);
        updateTextView(Integer.toString(getSpace().getMainTeam()), R.id.team);
        updateTextView(Integer.toString(getSpace().getMainInfoMatch()), R.id.match);
    }
    public String newString(int id) {
        TextView text = findViewById(id);
        return text.getText().toString();
    }
    public void submitButtonPageTwo(View view) {
        getSpace().getInfo().setName(newString(R.id.name));
        getSpace().getInfo().setTeam(Integer.valueOf(newString(R.id.team)));
        getSpace().getInfo().setMatch(newString(R.id.match));
        getSpace().getInfo().setAlliance(newString(R.id.alliance));

        Intent back = new Intent(this, MainActivity.class);
        back.putExtra("Game3", getSpace());
        startActivity(back);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_submit);
        info();
    }
}
