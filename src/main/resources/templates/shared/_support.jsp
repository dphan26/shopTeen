<th:block xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/extras/spring-security">



	<!-- Start Facility Section-->
	<section class="facility-section">
		<div class="container">
			<div class="row">
				<th:block th:each="item:${supports} ">
					<div class="col-md-4">
						<div class = "facility_box bg_light_yellow">
							<img th:src="'/data/supports/' + ${item.id} + '/' + ${item.imageUrl}"
							alt="">
							<div class="" th:text="${item.supportName}"></div>
							<div th:utext="${item.description}"></div>
						</div>
						
					</div>
				</th:block>
			</div>

		</div>
	</section>
	<!-- End Facility Section-->


	<style>
</style>
</th:block>