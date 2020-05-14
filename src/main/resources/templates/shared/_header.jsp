<th:block xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/extras/spring-security">


	<!-- https://dimsemenov.com/plugins/magnific-popup/documentation.html -->
	<!-- Start Header Section -->
	<header>
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<ul class="header_list text-md-left text-center">
							<li><a href="tel:+ 00 123 456 789"><i
									class="fa fa-phone"></i>+ 00 123 456 789</a></li>
							<li><a href="mailto:info@gmail.com"><i
									class="fa fa-envelope-o"></i>info@gmail.com</a></li>
						</ul>
					</div>
					<div class="col-md-6">
						<ul class="header_list text-md-right text-center">
							<th:block th:if="${#request.userPrincipal != null}">
								<li><a th:text="${#request.userPrincipal.name}"
									href="/users"></a></li>

								<li><a href="/signout">Dang xuat</a></li>

							</th:block>

							<th:block th:if="${#request.userPrincipal == null}">
								<li><a href="#test-popup1" class="open-popup-link">login</a>
									<div id="test-popup1"
										class="white-popup lr-popup mfp-hide text-center">

										<h4>Login chao doPT</h4>
										<form class="subscribe-popup-form" method="post"
											action="/signin">
											<input name="email" required type="email"
												placeholder="Enter Your Email" class="rounded-0"> <input
												name="password" required type="password"
												placeholder="Enter Your Password" class="rounded-0">

											<button class="btn btn-primary rounded-0" title="Login"
												type="submit">Login</button>
										</form>
									</div>
							</th:block>

						</ul>
					</div>



				</div>
			</div>
		</div>




		<div class="header-btm header_bottom">






			<div class="container">
				<nav class="navbar navbar-expand-lg">
					<div class="header_logo">
						<a href="index-1.html"><img src="image/logo.png" alt="logo"></a>
					</div>
					<button class="navbar-toggler menu_toggler" type="button"
						data-toggle="collapse" data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<i class="fa fa-bars"></i>
					</button>



					<div class="collapse navbar-collapse justify-content-end"
						id="navbarSupportedContent">
						<ul class="navbar-nav">
							<li class="nav-item dropdown "><a
								class="nav-link dropdown-toggler" href="#" role="button"
								data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false">Home<i class="fa fa-angle-down"></i><i
									class="fa fa-angle-right"></i></a></li>



							<li class="show"><a class="nav-link dropdown-toggler"
								href="#">Product</a>
								<div id="menu-binding" class="sub-menu mega-menu dropdown-menu"></div>
							</li>

							<li class="dropdown"><a class="nav-link"
								href="about-us.html">Category</a>
								<div class="sub-menu dropdown-menu">
									<ul class="all-menu">
										<li><a href="#">Category1</a></li>
										<li><a href="#">Category2</a></li>
									</ul>
								</div></li>

							<li class="nav-item"><a class="nav-link"
								href="about-us.html">About us</a></li>








						</ul>
					</div>



					<div class="header-right ml-3">
						<div class="header-cart">
							<a href="#">
								<div class="cart-icon">
									<img src="image/cart-icon.png" alt="cart-icon"> <span>02</span>
								</div>
							</a>
							<div class="cart-box">
								<div class="cart-info">
									<div class="cart-prodect d-flex">
										<div class="cart-img">
											<img src="image/cart-img-1.png" alt="cart-img">
										</div>
										<div class="cart-product">
											<a href="#">Ornare sed consequat</a>
											<p>$ 81.00</p>
										</div>
										<a href="#" class="close-icon d-flex align-items-center"><i
											class="ion-close"></i></a>
									</div>
									<div class="cart-prodect d-flex">
										<div class="cart-img">
											<img src="image/cart-img-2.png" alt="cart-img">
										</div>
										<div class="cart-product">
											<a href="#">Pellentesque posuere</a>
											<p>$ 80.00</p>
										</div>
										<a href="#" class="close-icon d-flex align-items-center"><i
											class="ion-close"></i></a>
									</div>
								</div>
								<div
									class="price-prodect d-flex align-items-center justify-content-between">
									<p class="total">total</p>
									<p class="total-price">$ 161.00</p>
								</div>
								<div class="cart-btn">
									<a href="cart.html" class="btn btn-primary rounded-0">View
										Cart</a>
								</div>
							</div>
						</div>
					</div>
				</nav>
			</div>
		</div>
		<script src="/otisjs.js"></script>
		<script>
			$(document).ready(
					function() {
						$.ajax({
							type : "GET",
							url : "/home/menu-binding",

							success : function(response) {
								$("#menu-binding").html(response);
							},
							error : function(response) {
								console.log("Lá»i há» thá»ng : "
										+ response);
							}
						});

					});
		</script>
	</header>
	<!-- End Header Section -->



	<a href="#" class="scrollup" style="display: none;"><i
		class="ion-ios-arrow-up"></i></a>

	<!-- Map js -->

	<!-- Custom css -->
	<script>
		$('.open-popup-link').magnificPopup({

			type : 'inline',
			midClick : true

		});
	</script>

</th:block>

