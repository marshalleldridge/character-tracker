package edu.cnm.deepdive;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import edu.cnm.deepdive.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    binding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = binding.getRoot();
    setContentView(view);
  }

//Strength
  @SuppressLint("SetTextI18n")
  public void plusOneToStr(View view) {
    float original = Float.parseFloat(binding.strVal.getText().toString());
    float update = original + 1F;
    binding.strVal.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToStr(View view) {
    float original = Float.parseFloat(binding.strVal.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      binding.strVal.setText(Float.toString(update));
    } else {
      binding.strVal.setText(Float.toString(original));
    }
  }

//Dexterity
  @SuppressLint("SetTextI18n")
  public void plusOneToDex(View view) {
    float original = Float.parseFloat(binding.dexVal.getText().toString());
    float update = original + 1F;
    binding.dexVal.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToDex(View view) {
    float original = Float.parseFloat(binding.dexVal.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      binding.dexVal.setText(Float.toString(update));
    } else {
      binding.dexVal.setText(Float.toString(original));
    }
  }

//Intelligence
  @SuppressLint("SetTextI18n")
  public void plusOneToInt(View view) {
    float original = Float.parseFloat(binding.intVal.getText().toString());
    float update = original + 1F;
    binding.intVal.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToInt(View view) {
    float original = Float.parseFloat(binding.intVal.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      binding.intVal.setText(Float.toString(update));
    } else {
      binding.intVal.setText(Float.toString(original));
    }
  }
//Wisdom
  @SuppressLint("SetTextI18n")
  public void plusOneToWis(View view) {
    float original = Float.parseFloat(binding.wisVal.getText().toString());
    float update = original + 1F;
    binding.wisVal.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToWis(View view) {
    float original = Float.parseFloat(binding.wisVal.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      binding.wisVal.setText(Float.toString(update));
    } else {
      binding.wisVal.setText(Float.toString(original));
    }
  }
//Agility
  @SuppressLint("SetTextI18n")
  public void plusOneToAgi(View view) {
    float original = Float.parseFloat(binding.agiVal.getText().toString());
    float update = original + 1F;
    binding.agiVal.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToAgi(View view) {
    float original = Float.parseFloat(binding.agiVal.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      binding.agiVal.setText(Float.toString(update));
    } else {
      binding.agiVal.setText(Float.toString(original));
    }
  }
//Constitution
  @SuppressLint("SetTextI18n")
  public void plusOneToCon(View view) {
    float original = Float.parseFloat(binding.conVal.getText().toString());
    float update = original + 1F;
    binding.conVal.setText(Float.toString(update));
  }

  @SuppressLint("SetTextI18n")
  public void minusOneToCon(View view) {
    float original = Float.parseFloat(binding.conVal.getText().toString());
    if (original > 1) {
      float update = original - 1F;
      binding.conVal.setText(Float.toString(update));
    } else {
      binding.conVal.setText(Float.toString(original));
    }
  }
}
