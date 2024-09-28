rootProject.name = "multi-module-project"

include(":db")
include(":service")
include(":api")
include("api:api")
findProject(":api:api")?.name = "api"
