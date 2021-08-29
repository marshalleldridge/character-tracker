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

  @SuppressLint("SetTextI18n")
  public void plusOneToStr(View view) {
  TextView strengthValue = findViewById(R.id.strength_value);
  float originalStrength = Float.parseFloat(strengthValue.getText().toString());
  float updateStrength = originalStrength + 1F;
  strengthValue.setText(Float.toString(updateStrength));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToStr(View view) {
    TextView strengthValue = findViewById(R.id.strength_value);
    float originalStrength = Float.parseFloat(strengthValue.getText().toString());
    if (originalStrength > 1) {
      float updateStrength = originalStrength - 1F;
      strengthValue.setText(Float.toString(updateStrength));
    } else {
      strengthValue.setText(Float.toString(originalStrength));
    }
  }

  @SuppressLint("SetTextI18n")
  public void plusOneToDex(View view) {
    TextView dexterityValue = findViewById(R.id.dexterity_value);
    float originalDexterity = Float.parseFloat(dexterityValue.getText().toString());
    float updateDexterity = originalDexterity + 1F;
    dexterityValue.setText(Float.toString(updateDexterity));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToDex(View view) {
    TextView dexterityValue = findViewById(R.id.dexterity_value);
    float originalDexterity = Float.parseFloat(dexterityValue.getText().toString());
    if (originalDexterity > 1) {
      float updateDexterity = originalDexterity - 1F;
      dexterityValue.setText(Float.toString(updateDexterity));
    } else {
      dexterityValue.setText(Float.toString(originalDexterity));
    }
  }
}
