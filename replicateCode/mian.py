from useful import *

Terminal.clear()

code = """
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:padding="10dp">

            <TextView
                android:id="@+id/{word}WLBL"
                android:textStyle="bold"
                android:textSize="20dp"
                android:textAlignment="center"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="" />

            <EditText
                android:id="@+id/{word}WTXT"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:ems="10"
                android:inputType="textPersonName"/>
        </LinearLayout>
"""