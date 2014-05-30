package fi.ilariel.unicodejs

/**
 * Created by Ilariel on 30.5.2014.
 */


public object ViewportRendererConst
{
    public val webgl :String ="webgl";
    public val canvas :String ="canvas";
    public val dom :String ="dom";
    public val auto :String ="auto";
}

/**
 * The tile engine viewport / window. Takes care of initializing a proper renderer.
 */
native public abstract class Viewport()
{

    /**
     * If the style of the parent element is modified, this needs to be called.
     */
    public fun updateStyle() : Unit = noImpl;

    /**
     * Switch renderer at runtime. All methods fallback to "dom" if unsuccesful.
     * Possible values:
     * "webgl" - Use WebGL with an HTML5 <canvas> element
     * "canvas" - Use HTML5 <canvas> element
     * "dom" - Use regular HTML element manipulation through DOM
     * "auto" - Use best available, i.e. try the above in order, picking the first that works
     */
    public fun setRenderer(newrenderer:String) : Unit = noImpl;

    /**
     * Gets the currently used renderer.
     * Returns:
     * One of "webgl", "canvas", "dom", "".
     */
    public fun getRendererString() : String = noImpl;

    /**
     * Puts a tile to the given coordinates.
     * Checks bounds and does nothing if invalid coordinates are given.
     * Parameters:
     * tile - the tile to put
     * x -  x coordinate
     * y -  y coordinate
     */
    public fun put(tile:Tile,x:Int,y:Int) : Unit = noImpl;

    /**
     * Puts a tile to the given coordinates.
     * Does *not* check bounds; throws exception if invalid coordinates are given.
     * Parameters:
     * tile - the tile to put
     * x -  x coordinate
     * y -  y coordinate
     */
    public fun unsafePut(tile:Tile,x:Int,y:Int) : Unit = noImpl;

    /**
     * Creates a row of tiles with the chars of the given string.
     * Wraps to next line if it can't fit the chars on one line.
     * Parameters:
     * str - the string to put
     * x - x coordinate (column)
     * y - y coordinate (row)
     * r - (optional) red foregorund color component 0-255
     * g - (optional) green foreground color component 0-255
     * b - (optional) blue foreground color component 0-255
     * br - (optional) red background color component 0-255
     * bg - (optional) green background color component 0-255
     * bb - (optional) blue background color component 0-255
     */
    public fun putString(str: String,x:Int,y:Int,r:Int =0,g:Int =0,b:Int = 0,br:Int = 0, bg:Int = 0,bb:Int = 0) : Unit = noImpl;

    /**
     * Returns the tile in the given coordinates.
     * Checks bounds and returns empty tile if invalid coordinates are given.
     * Parameters:
     * x - (integer) x coordinate
     * y - (integer) y coordinate
     */
    public fun get(x:Int,y:Int) : Tile = noImpl;

    /**
     * Clears the viewport buffer by assigning empty tiles.
     */
    public fun clear() : Unit = noImpl;

    /**
     * Renders the buffer as html to the element specified at construction.
     */
    public fun render() : Unit = noImpl;
}