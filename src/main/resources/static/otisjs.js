
function signIn() {
    $(document).ready(function () {
        var email = $("#email-signin").val();
        var password = $("#password-signin").val();
        $('#email-signin').on('input', function() {
        });
        if(email==""||password==""){  
        return	swal("Vui lòng nhập đầy đủ thông tin.abc"); 
        }
        
        
  
        $.ajax({
            type: "POST",
            url: "/users/signin",
            data: {
                email: email,
                password: password,
                
            },
            success: function (response) {
                switch (response) {
                    case "OK":
                        location.reload();
                        break;
                    case "NotPassword":
                        swal("THÔNG BÁO LỖI", "Bạn đã nhập sai mật khẩu.", "error");
                        break;
                    case "Blocked":
                        swal("THÔNG BÁO LỖI", "Tài khoản của bạn đã bị khóa.", "error");
                        break;
                    case "NotFound":
                    	   swal("THÔNG BÁO LỖI", "Tài khoản của bạn không đúng.", "error");
                        break;
                    case "Null":
                        swal("Vui lòng nhập đầy đủ thông tin.");
                        break;
                        default:
                        	 $("#password-signin-ok").val(response);
                        setTimeout(function(){ 
                        	 $("#btn-signin-submit").trigger("click");
                        	}
                        , 200);
                        	
                        break;
                }
            },
            error: function (response) {
                swal("Lỗi Hệ Thống : " + response);
            }
        });
    });
}

