
<th:block xmlns="http://www.w3.org/1999/xhtml"
    xmlns:th="http://www.thymeleaf.org"
    xmlns:sec="http://www.thymeleaf.org/extras/spring-security">
  
   <div th:replace="shared/_head"></div>
   <div th:replace="shared/_header"></div>
   

<div class="entry-header-area">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="entry-header">
                    <h1 class="entry-title">TÀI KHOẢN</h1>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="my-account-area">
    <div class="container">
        <div class="row">
            <div class="col-md-3">

            </div>
            <div class="col-md-6" style="border: 1px solid #e8e8e9; padding:30px">
                <form id="form-signup" method="post" autocomplete="off">
                 <div class="form-fields">
                    <h1>ĐĂNG KÝ</h1>
                    <p>
                        <label>Họ Tên<span class="required text-danger"> *</span></label>
                        <input name="fullNameSignUp" id="fullname-signup" placeholder="Nhập họ tên ..." >
                    </p>
                    <p>
                        <label>Email<span class="required text-danger"> *</span></label>
                        <input name="emailSignUp" id="email-signup" placeholder="Nhập email ..."  autocomplete="off">
                    </p>
                    <p>
                        <label>Mật Khẩu<span class="required text-danger"> *</span></label>
                        <input name="passwordSignUp" id="password-signup" placeholder="Nhập mật khẩu ..." type="password" >
                    </p>
                    <div class="row">
                        <div class="col-sm-12 text-right" style="padding-top:7px">
                          
						<button class="btn btn-info" style="width:100%"  type="submit">ĐĂNG KÝ</button>

                        </div>
                    </div>
                   
                </div>
                
                </form>
               
              
            </div>
            <div class="col-md-3">

            </div>
        </div>
    </div>
</div>





   <div th:replace="shared/_footer"></div>
</th:block>

<style>
	.error{
		color:red
	}
</style>


<script>
    $(document).ready(function () {
        $("#form-signup").validate({
            rules: {
                fullNameSignUp: {
                	required : true,
                	minlength: 4,
                	maxlength: 32,
                },
                emailSignUp: {
                	required : true,
                	email: true,
                	minlength: 6,
                	maxlength: 32,
                },
                passwordSignUp: {
                	required : true,
                	minlength: 6,
                	maxlength: 32,          	
                },
            },
            messages: {
            	fullNameSignUp: {
                    required: "Không được bỏ trống mục này.",
                    minlength : "Độ dài 'Họ Tên' từ 4 - 32 ký tự",
                    maxlength : "Độ dài 'Họ Tên' từ 4 - 32 ký tự",
                   
                },
                emailSignUp: {
                	required: "Không được bỏ trống mục này.",
                    email : "Vui lòng nhập đúng định dạng email.",
                    minlength : "Độ dài 'Email' từ 6 - 32 ký tự",
                    maxlength : "Độ dài 'Email' từ 6 - 32 ký tự",
                },
                passwordSignUp: {
                	required: "Không được bỏ trống mục này.",
                    minlength : "Độ dài 'Mật Khẩu' từ 6 - 32 ký tự",
                    maxlength : "Độ dài 'Mật Khẩu' từ 6 - 32 ký tự",
                },             
            },
            submitHandler: function () {
            	signUp();
               
            }


        });

    });
</script>