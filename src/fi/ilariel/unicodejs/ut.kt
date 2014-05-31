package fi.ilariel.unicodejs

/**
 * Created by Ilariel on 30.5.2014.
 */





native(name = "ut")
public object ut
{
    //input.js

    /**
     * Checks if given key is pressed down. You must call [[ut.initInput()]] first.
     * Parameters: key - key code to check
     * Returns: True if the key is pressed down, false otherwise.
     */
    public fun isKeyPressed(key :Int) : Boolean = noImpl

    /**
     * Sets the interval when user's onKeyDown handler is called when a key is held down.
     * [[ut.initInput]] must be called with a handler for this to work.
     * Parameters: milliseconds - the interval delay in milliseconds (1 second = 1000 milliseconds)
     */
    public fun setKeyRepeatInterval(milliseconds : Int) : Unit = noImpl;


    /**
     * Initilizes input by assigning default key handlers and optional user's handlers.
     * This must be called in order to <ut.isKeyPressed> to work.
     * Parameters:
     * onkeydown - function(keyCode) for key down event handler.
     * onkeyup - function(keyCode) for key up event handler.
     * Either define both parameters or define neither.
     */
    public fun initInput(onKeyDown : ((k:Int) -> Unit)? = null , onKeyUp :((k:Int) -> Unit)? = null) : Unit = noImpl;

    /**
     * The interval when user's onKeyDown handler is called when a key is held down.
     */
    public var keyRepeatDelay : Int = noImpl;

    ///KEY CONSTANTS

    public val KEY_BACKSPACE : Int = noImpl;
    public val KEY_TAB : Int = noImpl;
    public val KEY_ENTER : Int =noImpl;
    public val KEY_SHIFT : Int =noImpl;
    public val KEY_CTRL : Int = noImpl;
    public val KEY_ALT : Int = noImpl;
    public val KEY_ESCAPE : Int = noImpl;
    public val KEY_SPACE :Int = noImpl;
    public val KEY_LEFT : Int = noImpl;
    public val KEY_UP : Int = noImpl;
    public val KEY_RIGHT : Int =noImpl;
    public val KEY_DOWN : Int = noImpl;

    public val KEY_0 : Int = noImpl;
    public val KEY_1 : Int = noImpl;
    public val KEY_2 : Int = noImpl;
    public val KEY_3 : Int = noImpl;
    public val KEY_4 : Int = noImpl;
    public val KEY_5 : Int = noImpl;
    public val KEY_6 : Int = noImpl;
    public val KEY_7 : Int = noImpl;
    public val KEY_8 : Int = noImpl;
    public val KEY_9 : Int = noImpl;

    public val KEY_A : Int = noImpl;
    public val KEY_B : Int = noImpl;
    public val KEY_C : Int = noImpl;
    public val KEY_D : Int = noImpl;
    public val KEY_E : Int = noImpl;
    public val KEY_F : Int = noImpl;
    public val KEY_G : Int = noImpl;
    public val KEY_H : Int = noImpl;
    public val KEY_I : Int = noImpl;
    public val KEY_J : Int = noImpl;
    public val KEY_K : Int = noImpl;
    public val KEY_L : Int = noImpl;
    public val KEY_M : Int = noImpl;
    public val KEY_N : Int = noImpl;
    public val KEY_O : Int = noImpl;
    public val KEY_P : Int = noImpl;
    public val KEY_Q : Int = noImpl;
    public val KEY_R : Int = noImpl;
    public val KEY_S : Int = noImpl;
    public val KEY_T : Int = noImpl;
    public val KEY_U : Int = noImpl;
    public val KEY_V : Int = noImpl;
    public val KEY_W : Int = noImpl;
    public val KEY_X : Int = noImpl;
    public val KEY_Y : Int = noImpl;
    public val KEY_Z : Int = noImpl;

    public val KEY_NUMPAD0 : Int = noImpl;
    public val KEY_NUMPAD1 : Int = noImpl;
    public val KEY_NUMPAD2 : Int = noImpl;
    public val KEY_NUMPAD3 : Int = noImpl;
    public val KEY_NUMPAD4 : Int = noImpl;
    public val KEY_NUMPAD5 : Int = noImpl;
    public val KEY_NUMPAD6 : Int = noImpl;
    public val KEY_NUMPAD7 : Int = noImpl;
    public val KEY_NUMPAD8 : Int = noImpl;
    public val KEY_NUMPAD9 : Int = noImpl;

    public val KEY_F1 : Int = noImpl;
    public val KEY_F2 : Int = noImpl;
    public val KEY_F3 : Int = noImpl;
    public val KEY_F4 : Int = noImpl;
    public val KEY_F5 : Int = noImpl;
    public val KEY_F6 : Int = noImpl;
    public val KEY_F7 : Int = noImpl;
    public val KEY_F8 : Int = noImpl;
    public val KEY_F9 : Int = noImpl;
    public val KEY_F10 : Int = noImpl;
    public val KEY_F11 : Int = noImpl;
    public val KEY_F12 : Int = noImpl;

    public val KEY_COMMA : Int = noImpl;
    public val KEY_DASH : Int = noImpl;
    public val KEY_PERIOD : Int = noImpl;

    /**
     * Version of the library as string.
     */
    public val VERRSION : String = noImpl

    /**
     * Character used when none is specified otherwise.
     */
    public val NULLCHAR : String = noImpl;

    /**
     * The CSS class name used for the tile engine element.
     */
    public val CSSCLASS : String = noImpl;

    /**
     * The tile used as placeholder for empty tile.
     */
    public val NULLTILE : Tile = noImpl;
}