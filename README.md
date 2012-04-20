Android 4.0 NumberPicker backported to 2.1
Requires JakeWhartons NineOldAndroids library: https://github.com/JakeWharton/NineOldAndroids
Probably has to be built against API level 15

USAGE
=====
First, some attributes have to be added to the theme used by your application.
For a **dark** theme, add these:
    <item name="numberPickerUpButtonStyle">@style/NPWidget.Holo.ImageButton.NumberPickerUpButton</item>
    <item name="numberPickerDownButtonStyle">@style/NPWidget.Holo.ImageButton.NumberPickerDownButton</item>
    <item name="numberPickerInputTextStyle">@style/NPWidget.Holo.EditText.NumberPickerInputText</item>
    <item name="numberPickerStyle">@style/NPWidget.Holo.NumberPicker</item>

For a **light** theme, add these:
    <item name="numberPickerUpButtonStyle">@style/NPWidget.Holo.Light.ImageButton.NumberPickerUpButton</item>
    <item name="numberPickerDownButtonStyle">@style/NPWidget.Holo.Light.ImageButton.NumberPickerDownButton</item>
    <item name="numberPickerInputTextStyle">@style/NPWidget.Holo.Light.EditText.NumberPickerInputText</item>
    <item name="numberPickerStyle">@style/NPWidget.Holo.Light.NumberPicker</item>

Then just add the widget to your layout:
<net.simonvt.widget.NumberPicker
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />