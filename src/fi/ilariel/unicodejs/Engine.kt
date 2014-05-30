package fi.ilariel.unicodejs

/**
 * Created by Ilariel on 30.5.2014.
 */

/**
 * The tile engine itself.
 */
native public abstract class Engine
{

    /**
     * Sets the function to be called with coordinates to fetch each tile.
     * Optionally can apply a transition effect. Effects are:
     * "boxin", "boxout", "circlein", "circleout", "random"
     *
     * Parameters:
     * func - function taking parameters (x, y) and returning an ut.Tile
     * effect - (optional) name of effect to use (see above for legal values)
     * duration - (optional) how many milliseconds the transition effect should last
     */
    public fun setTileFunc(func:(x:Int,y:Int)->Tile,effect:String,duration:Int) : Unit = noImpl;

    /**
     * Sets the function to be called to fetch mask information according to coordinates.
     * If mask function returns false to some coordinates, then that tile is not rendered.
     * Parameters:
     * func - function taking parameters (x, y) and returning a true if the tile is visible
     */
    public fun setMaskFunc(func:(x:Int,y:Int)->Boolean) : Unit = noImpl;


    /**
     * Sets the function to be called to post-process / shade each visible tile.
     * Shader function is called even if caching is enabled, see [[Engine.setCacheEnabled]].
     */
    public fun setShaderFunc(func:(tile:Tile, x:Int, y:Int)->Tile) : Unit = noImpl;

    /**
     * Sets the function to be called to post-process / shade each visible tile.
     * Shader function is called even if caching is enabled, see [[Engine.setCacheEnabled]].
     */
    public fun setShaderFunc(func:(tile:Tile,x:Int,y:Int,timeNow:Long)->Tile) : Unit = noImpl;

    /**
     * Tiles outside of the range x = [0,width[; y = [0,height[ are not fetched.
     * Call parameterless overload in order to make the world infinite.
     * 
     * Parameters:
     * width - new world width
     * height -  new world height
     */
    public fun setWorldSize(width:Int,height:Int) : Unit = noImpl;

    /**
     * Make the world infinite.
     */
    public fun setWorldSize() : Unit = noImpl;

    /**
     * Enables or disables the usage of tile cache. This means that
     * extra measures are taken to not call the tile function unnecessarily.
     * This means that all animating must be done in a shader function,
     * see [[Engine.setShaderFunc]].
     * Cache is off by default, but should be enabled if the tile function
     * does more computation than a simple array look-up.
     *
     * Parameters:
     * mode - true to enable, false to disable
     */
    public fun setCacheEnabled() : Unit = noImpl;

    /**
     * Updates the viewport according to the given player coordinates.
     * The algorithm goes as follows:
     * * Record the current time
     *  * For each viewport tile:
     *  * Check if the tile is visible by testing the mask
     *  * If not visible, continue to the next tile in the viewport
     *  * Otherwise, if cache is enabled try to fetch the tile from there
     *  * Otherwise, call the tile function and check for shader function presence
     *  * If there is shader function, apply it to the tile, passing the recorded time
     *  * Put the tile to viewport
     *
     *  Parameters:
     *   x - viewport center x coordinate in the tile world
     *   y - viewport center y coordinate in the tile world
     */
    public fun update(x:Int,y:Int) : Unit = noImpl;


}