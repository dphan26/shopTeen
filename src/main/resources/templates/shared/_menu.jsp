<th:block xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/extras/spring-security">


<ul class="d-lg-flex">
<th:block th:each="item : ${menutopics}">
		<li class="submenu-links dropdown col-lg-3">	
			<a th:text="${item.topicName}" class="menu-title dropdown-toggler" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
				th:href="'/products?topicid=' + ${item.id}" >
			</a> 
		<ul class="all-menu dropdown-menu">
			
			<th:block th:each="jtem : ${menucategories}">
					<th:block th:if="${jtem.topicId.id == item.id}">
					<li>
						<a 
						th:href="'/products?cateid=' + ${jtem.id}" 
						 th:text="${jtem.categoryName}"></a>
					</li>
						
				
						
					</th:block>
	
				</th:block>
		</ul>
				
			
			
		</li>
		
		
	
	</th:block></ul>
	
</th:block>