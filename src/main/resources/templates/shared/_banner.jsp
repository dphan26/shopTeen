<th:block th:fragment="banner" xmlns="http://www.w3.org/1999/xhtml"
    xmlns:th="http://www.thymeleaf.org"
    xmlns:sec="http://www.thymeleaf.org/extras/spring-security">
<!-- Start Slider Section -->
<section class="slider full-screen pt-0">
	<div id="carouselExampleFade" class="carousel slide carousel-fade" data-ride="carousel">
    	<div class="carousel-inner">
        	<div class="carousel-item active slider-area background_bg" data-img-src="image/slider-img-13.jpg">
                <div class="banner_slide_content slider_content">
                    <div class="container">
                        <div class="row">
                            <div class="col-12">
                                <div class="slider_text text-white">
                                    <h2 class="animation slider_heading1" data-animation="fadeInLeft" data-animation-delay="0.2s">Summer</h2>
                                    <h3 class="animation slider_heading2" data-animation="fadeInRight" data-animation-delay="0.4s">Collection</h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="banner_img">
                	<img src="image/banner_img.png" alt="banner_img"/>
                </div>
            </div>
            <div class="carousel-item slider-area background_bg" data-img-src="image/slider-img-12.jpg">
                <div class="banner_slide_content left-align">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-6 col-sm-7 col-9">
                                <div class="slider_caption">
                                    <h1 class="animation" data-animation="fadeInRight" data-animation-delay="0.2s">SUMMER SALE</h1>
                                    <p class="animation" data-animation="fadeInRight" data-animation-delay="0.4s">Lorem ipsum dolor sit amet, consectetur adipiscing elit. In ut ullamcorper leo, eget euismod orci.</p>
                                    <a href="shop.html" class="btn btn-primary rounded-0 animation" data-animation="fadeInRight" data-animation-delay="0.6s">Shop Now</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="carousel-item slider-area background_bg" data-img-src="image/slider-img-14.jpg">
                <div class="banner_slide_content center-align">
                    <div class="container">
                        <div class="row justify-content-end">
                            <div class="col-md-6 col-sm-7 col-9">
                                <div class="slide_content">
                                	<div class="slider_strip animation" data-animation="fadeInRight" data-animation-delay="0.2s">Get up to <span class="text_default">50% off</span> Today Only!</div>
                                    <h3 class="animation slider_heading3" data-animation="fadeInRight" data-animation-delay="0.4s">Woman Fashion New Collection!</h3>
                                    <p class="animation" data-animation="fadeInRight" data-animation-delay="0.6s">Lorem ipsum dolor sit amet, consectetur adipiscing elit. In ut ullamcorper leo, eget euismod orci.</p>
                                    <a href="shop.html" class="btn btn-primary rounded-0 animation" data-animation="fadeInRight" data-animation-delay="0.8s">Shop Now</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="carousel_nav">
            <a class="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev"><i class="ion-chevron-left"></i></a>
            <a class="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next"><i class="ion-chevron-right"></i></a>
        </div>
    </div>
</section>
<!-- End Slider Section -->

</th:block>
 