package tech.mobiledeveloper.core.di

import tech.mobiledeveloper.core.database.AppDatabase

object InjectProvider {
    private val dependencies: HashMap<String, Any> = hashMapOf()
    
    fun addDependency(key: String, dependency: Any) {
        dependencies[key] = dependency
    }
    
    fun <T> getDependency(key: String): T {
        @Suppress("UNCHECKED_CAST")
        return dependencies[key] as T
    }
    
    fun getDatabase(): AppDatabase = getDependency<AppDatabase>("database")
}