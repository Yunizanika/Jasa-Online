package id.polbeng.yun.jasaonline.models

data class LoginResponse(
    val message: String,
    var error: Boolean,
    var data: User
)