<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">

<h3>Alien Travel Calculator</h3>

<form method="GET"
	action="/ssg-exercises-pair/alienDriveTimeResults">
	
	<div>
		
		<div id="planetselect">
		<label for="genre">Choose a Planet</label>
  				<select name="planetName">
    				<option value="Jupiter">Jupiter</option>
    				<option value="Mars">Mars</option>
    				<option value="Mercury">Mercury</option>
    				<option value="Neptune">Neptune</option>
    				<option value="Saturn">Saturn</option>
    				<option value="Uranus">Uranus</option>
     				<option value="Venus">Venus</option>
  				</select>
  		</div> 
  		
  		<div id="transpmodeselect">
		<label for="genre">Choose a Mode of Transportation</label>
  				<select name="modeSelect">
    				<option value="Walking">Walking</option>
    				<option value="Car">Car</option>
    				<option value="Bullet Train">Bullet Train</option>
    				<option value="Boeing 747">Boeing 747</option>
    				<option value="Concorde">Concorde</option>
  				</select>
  		</div> 
		
		<div id="earthage">
		<label for="minLength">Enter Your Earth Age</label>
			<input type="text" id="earthAge" name="earthAge" />
		</div>
	</div>
	<div id="submitbutton">
	<input type="submit" value="Calculate Travel Time" />
	</div>

</form>
 
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />l>