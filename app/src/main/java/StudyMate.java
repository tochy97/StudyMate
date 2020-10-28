import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.studymate.R;

public class StudyMate extends AppCompatActivity {
    private static final String TAG = "StudyMate";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studymate);

        Log.d(TAG, "onCreate: started.");
    }
}
