package sample.singleton

/*
    Only one instance
    Single point of access
    Uses:
        * Network Manager
        * Database access
        * Logging
        * Utility Class
 */

/*
class Singleton {
    private object HOLDER {
        val INSTANCE = Singleton()
    }
    companion object{
        val instance: Singleton by lazy { HOLDER.INSTANCE }
    }
}*/
object DatabaseDriver {
    init {
        println("Intializing: $this")
    }
    fun log(): DatabaseDriver {
        return apply { println("Database Driver: $this") }
    }
}


