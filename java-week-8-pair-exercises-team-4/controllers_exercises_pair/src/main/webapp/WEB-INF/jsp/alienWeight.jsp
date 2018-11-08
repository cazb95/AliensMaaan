<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">

<h3>Alien Weight Calculator</h3>

<form method="GET"
	action="/ssg-exercises-pair/alienWeightResults">
	
	<div>
		
		<div id="planetselect">
		<label for="genre">Choose a Planet</label>
  				<select name="genre">
    				<option value="Jupiter">Jupiter</option>
    				<option value="Mars">Mars</option>
    				<option value="Mercury">Mercury</option>
    				<option value="Neptune">Neptune</option>
    				<option value="Saturn">Saturn</option>
    				<option value="Uranus">Uranus</option>
     				<option value="Venus">Venus</option>
  				</select>
  		</div> 
		
		<div id="earthweight">
		<label for="minLength">Enter Your Earth Weight</label>
			<input type="text" id="earthWeight" name="earthWeight" />
		</div>
	</div>
	<div id="submitbutton">
	<input type="submit" value="Calculate Weight" />
	</div>

</form>
 
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />tml>