package fi.ilariel.unicodejs

/**
 * Created by Ilariel on 31.5.2014.
 */

/**
 * Represents a unicode character tile with various attributes.
 *
 * Constructs a new [[Tile]] object.
 * Parameters:
 * ch - a character to display for this tile
 * r - (optional) red foregorund color component 0-255
 * g - (optional) green foreground color component 0-255
 * b - (optional) blue foreground color component 0-255
 * br - (optional) red background color component 0-255
 * bg - (optional) green background color component 0-255
 * bb - (optional) blue background color component 0-255
 */
native(name = "ut.Tile") public class Tile(ch:String, r:Int = 0, g:Int = 0, b:Int = 0, br:Int = 0, bg:Int = 0, bb:Int = 0)
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