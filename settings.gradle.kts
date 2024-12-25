rootProject.name = "multimodule-clean-arch-template"

include(":domain")
include(":usecase:api")
include(":usecase:core")
include(":persistence:postgres-persistence")
include(":application")
include(":integration:integration-demo")
include(":controller:rest")
