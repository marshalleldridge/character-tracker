package edu.cnm.deepdive;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

//Strength
  @SuppressLint("SetTextI18n")
  public void plusOneToStr(View view) {
    TextView value = findViewById(R.id.strength_value);
    float original = Float.parseFloat(value.getText().toString());
    float update = original + 1F;
    value.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToStr(View view) {
    TextView value = findViewById(R.id.strength_value);
    float original = Float.parseFloat(value.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      value.setText(Float.toString(update));
    } else {
      value.setText(Float.toString(original));
    }
  }
//Dexterity
  @SuppressLint("SetTextI18n")
  public void plusOneToDex(View view) {
    TextView value = findViewById(R.id.dexterity_value);
    float original = Float.parseFloat(value.getText().toString());
    float update = original + 1F;
    value.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToDex(View view) {
    TextView value = findViewById(R.id.dexterity_value);
    float original = Float.parseFloat(value.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      value.setText(Float.toString(update));
    } else {
      value.setText(Float.toString(original));
    }
  }
//Intelligence
  @SuppressLint("SetTextI18n")
  public void plusOneToInt(View view) {
    TextView value = findViewById(R.id.intelligence_value);
    float original = Float.parseFloat(value.getText().toString());
    float update = original + 1F;
    value.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToInt(View view) {
    TextView value = findViewById(R.id.intelligence_value);
    float original = Float.parseFloat(value.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      value.setText(Float.toString(update));
    } else {
      value.setText(Float.toString(original));
    }
  }
//Wisdom
  @SuppressLint("SetTextI18n")
  public void plusOneToWis(View view) {
    TextView value = findViewById(R.id.wisdom_value);
    float original = Float.parseFloat(value.getText().toString());
    float update = original + 1F;
    value.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToWis(View view) {
    TextView value = findViewById(R.id.wisdom_value);
    float original = Float.parseFloat(value.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      value.setText(Float.toString(update));
    } else {
      value.setText(Float.toString(original));
    }
  }
//Agility
  @SuppressLint("SetTextI18n")
  public void plusOneToAgi(View view) {
    TextView value = findViewById(R.id.agility_value);
    float original = Float.parseFloat(value.getText().toString());
    float update = original + 1F;
    value.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToAgi(View view) {
    TextView value = findViewById(R.id.agility_value);
    float original = Float.parseFloat(value.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      value.setText(Float.toString(update));
    } else {
      value.setText(Float.toString(original));
    }
  }
//Constitution
  @SuppressLint("SetTextI18n")
  public void plusOneToCon(View view) {
    TextView value = findViewById(R.id.constitution_value);
    float original = Float.parseFloat(value.getText().toString());
    float update = original + 1F;
    value.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToCon(View view) {
    TextView value = findViewById(R.id.constitution_value);
    float original = Float.parseFloat(value.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      value.setText(Float.toString(update));
    } else {
      value.setText(Float.toString(original));
    }
  }
}
