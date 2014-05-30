package fi.ilariel.unicodejs

/**
 * Created by Ilariel on 30.5.2014.
 */

/**
 * Represents a unicode character tile with various attributes.
 */
native public abstract class Tile
{

    /**
     * Returns the character of this tile.
     */
    public fun getChar() :String =noImpl;

    /**
     * Sets the character of this tile.
     */
    public fun setChar(ch:String) : Unit = noImpl;
    /**
     * Sets the foreground color of this tile.
     */
    public fun setColor(r:Int, g:Int, b:Int) : Unit = noImpl;

    /**
     * Sets the foreground color to the given shade (0-255) of grey.
     */
    public fun setGrey(grey:Int) : Unit = noImpl;
    /**
     * Sets the background color of this tile.
     */
    public fun setBackground(r:Int, g:Int, b:Int) : Unit = noImpl;
    /**
     * Clears the color of this tile / assigns default color.
     */
    public fun resetColor() : Unit = noImpl;
    /**
     * Clears the background color of this tile.
     */
    public fun resetBackground() : Unit = noImpl;

    /**
     * Returns the hexadecimal representation of the color
     */
    public  fun getColorHex() : String = noImpl;

    /**
     * Returns the hexadecimal representation of the background color
     */
    public  fun getBackgroundHex() : String = noImpl;

    /**
     * Returns the CSS rgb(r,g,b) representation of the color
     */
    public  fun getColorRGB() : String = noImpl;

    /**
     * Returns the CSS rgb(r,g,b) representation of the background color
     */
    public  fun getBackgroundRGB() : String = noImpl;

    /**
     * Returns the JSON representation of the color, i.e. object { r, g, b }
     */
    public  fun getColorJSON() : Json = noImpl;

    /**
     * Returns the JSON representation of the background color, i.e. object { r, g, b }
     */
    public fun getBackgroundJSON() : Json = noImpl;

    /**
     *  Makes this tile identical to the one supplied. Custom properties are not copied.
     */
    public fun copy(other : Tile) : Unit = noImpl;

    /**
     * Returns a new copy of this tile. Custom properties are not cloned.
     */
    public fun clone() : Tile = noImpl;

}