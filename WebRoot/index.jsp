<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   
   
   <title>Home</title>
		<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		 <script src="js/jquery.min.js"></script>
		 <!---- start-smoth-scrolling---->
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
		<!---- start-smoth-scrolling---->
		 <!-- Custom Theme files -->
		<link href="css/theme-style.css" rel='stylesheet' type='text/css' />
   		 <!-- Custom Theme files -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		</script>
		<!----webfonts---->
		<link href='http://fonts.googleapis.com/css?family=Ubuntu:300,400,500,700,400italic' rel='stylesheet' type='text/css'>
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600,800,300,700' rel='stylesheet' type='text/css'>
		<!----//webfonts---->
		<!----start-top-nav-script---->
		<script>
			$(function() {
				var pull 		= $('#pull');
					menu 		= $('nav ul');
					menuHeight	= menu.height();
				$(pull).on('click', function(e) {
					e.preventDefault();
					menu.slideToggle();
				});
				$(window).resize(function(){
	        		var w = $(window).width();
	        		if(w > 320 && menu.is(':hidden')) {
	        			menu.removeAttr('style');
	        		}
	    		});
			});
		</script>
		<!----//End-top-nav-script---->
   
   
  </head>
  
  <body>
 
 
 	<!-----start-container---->
			<div class="bg">
				<div class="container">
				<div class="header">
					<div class="contact-no">
						<span><a href="<%=basePath%>tycustomerback/loginout.action"><span> ${tyCustomerBack.cusname}</span></a></span>
					</div>
					<div class="logo">
						<a href="#"><img src="images/logo.png" title="miami" /></a>
					</div>
					<div class="contact-order">
						<a href="#">Call to order</a>
					</div>
					<div class="clearfix"> </div>
				</div>
					<!----start-top-nav---->
				 <nav class="top-nav">
					<ul class="top-nav">
						<li class="active"><a href="#home" class="scroll">Home</a></li>
						<li class="page-scroll"><a href="#about" class="scroll">About us</a></li>
						<li class="page-scroll"><a href="#gal" class="scroll">Gallery</a></li>
						<li class="page-scroll"><a href="#con" class="scroll">Consulation</a></li>
						<li class="page-scroll"><a href="#test" class="scroll">Testimonials</a></li>
						<li class="page-scroll"><a href="#contact" class="scroll">Contact</a></li>
					</ul>
					<a href="#" id="pull"><img src="images/nav-icon.png" title="menu" /></a>
				</nav>
			</div>
		</div>
		<!-----start-about---->
		<div id="about" class="about">
			<div class="container">
				<div >
					<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
						<tr>
							<th width="30"><input type="checkbox"/>
							</th>
							<th>id</th>
							<th>客户姓名</th>
							<th>身份证号</th>
							<th>客户电话</th>
							<th>客户地址</th>
							<th>客户邮件</th>
							<th>客户意向</th>
							<th>存档日期</th>
						 </tr>
						<tr>
							<td><input type="checkbox" name="id" value="${tyCustomerBack.cusid}"/></td>
							<td>${tyCustomerBack.cusid}</td>
							<td>${tyCustomerBack.cusname}</td>
							<td>${tyCustomerBack.cusCard}</td>
							<td>${tyCustomerBack.teltphono}</td>
							<td>${tyCustomerBack.address}</td>
							<td>${tyCustomerBack.email}</td>
							<td>${tyCustomerBack.desire}</td>
							<td>${tyCustomerBack.savedate}</td>
							</tr>
					</table>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<!-----//End-about---->
        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="��վģ��">��վģ��</a></div>
		<!----start-gallery---->
		<div id="gal" class="gallery">
			<div class="container">
				<div class="head">
					<h3>Gallery <span> </span></h3>
				</div>
				<div class="gallery-grids">
					<div class="gallery-grids-row1">
						<div class="col-md-8 gallery-grid1">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="port-pic" src="images/g1.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> Miami places</span>
										<button>View photo</button>
										<label> <i class="fa fa-heart"> </i> 21</label>
									</h2>
								</div>
							</a>
						</div>
						<div class="col-md-4 gallery-grid1">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="port-pic" src="images/g2.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> Miami places</span>
										<button>View photo</button>
										<label> <i class="fa fa-heart"> </i> 21</label>
									</h2>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
						<p class="place">Marina Palms / <a href="#">North Miami Beach, FL 33162</a></p>
					</div>
					<div class="gallery-grids-row1">
						<div class="col-md-6 gallery-grid1">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="port-pic" src="images/g3.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> Miami places</span>
										<button>View photo</button>
										<label> <i class="fa fa-heart"> </i> 21</label>
									</h2>
								</div>
							</a>
						</div>
						<div class="col-md-6 gallery-grid1">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="port-pic" src="images/g4.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> Miami places</span>
										<button>View photo</button>
										<label> <i class="fa fa-heart"> </i> 21</label>
									</h2>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
						<p class="place">Edition Residens /<a href="#">Miami Beach, FL 33139</a></p>
					</div>
					<!----->
					<div class="gallery-grids-row1">
						<div class="col-md-4 gallery-grid1">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="port-pic" src="images/g2.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> Miami places</span>
										<button>View photo</button>
										<label> <i class="fa fa-heart"> </i> 21</label>
									</h2>
								</div>
							</a>
						</div>
						<div class="col-md-8 gallery-grid1">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="port-pic" src="images/g1.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> Miami places</span>
										<button>View photo</button>
										<label> <i class="fa fa-heart"> </i> 21</label>
									</h2>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
						<p class="place">Faena House / <a href="#">Miami Beach, FL 33140</a></p>
					</div>
				</div>
				<a class="view-gallery-btn" href="#">View all</a>
			</div>
		</div>
		<!----//End-gallery---->
		<!----start-consulation----->
		<div id="con" class="consulation">
			<div class="container">
				<div class="head c-head">
						<h3>Consulation <span> </span></h3>
				</div>
				<div class="consulation-grids">
					<div class="col-md-7 consulation-left">
						<h4>How long have you do yourself a gift?</h4>
						<p>The procedural change mezzo forte starts izoritmichesky pickup at these moments stop LA Mazel and VA Tsukkerman in his "Analysis of musical works." Pointillism, which originated in the music of the early twentieth century, microforms, found a distant historical</p>
					</div>
					<div class="col-md-5 consulation-right">
								<form>
									<input type="text" value="Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Name';}">
									<input type="text" value="Phone " onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Phone';}">
									<input type="text" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}">
									<input type="submit" value="Consultation" />
								</form>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<!----//End-consulation----->
		<!----start-testmonials---->
		<div id="test" class="testmonials">
			<div class="container">
				<div class="head c-head">
						<h3>Testimonials <span> </span></h3>
				</div>
				<!----start-testmonials-grids----->
				<div class="testmonials-grids text-center">
					<div class="col-md-4 testmonial-grid">
						<a href="#"><img class="t-pic" src="images/t1.jpg" title="name" /></a>
						<h5><a href="#">Stev Joni</a></h5>
						<span>Founder Lucoil</span>
						<p>Nice work, Certificates National Association of Realtors (USA).</p>
					</div>
					<div class="col-md-4 testmonial-grid">
						<a href="#"><img class="t-pic" src="images/t2.jpg" title="name" /></a>
						<h5><a href="#">Alisher Usmanov</a></h5>
						<span>Ural Steel</span>
						<p>My soul is illuminated by an unearthly joy, as these beautiful spring morning, which I enjoy with all my heart. I'm all alone and blissfully happy in the local edge.</p>
					</div>
					<div class="col-md-4 testmonial-grid">
						<a href="#"><img class="t-pic" src="images/t3.jpg" title="name" /></a>
						<h5><a href="#">Stev Joni</a></h5>
						<span>Founder Lucoil</span>
						<p>When my lovely valley of steam rises and half-day sun is above an impermeable. thicket</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<!----//End-testmonials-grids----->
			</div>
		</div>
		<!----//End-testmonials---->
		<!----start-contact---->
		<div id="contact" class="contact">
			<div class="container">
				<div class="head">
						<h3>Contact <span> </span></h3>
				</div>
				<div class="contact-grids">
					<div class="col-md-6 contact-left">
						<a href="#">Hello@miami.com</a><br />
						<p>8 800 678 78 78</p>
						<p>8 800 678 78 78</p><br />
						<p><label>400 first ave. n.</label><label>suite 700</label><label>Minneapolis, MN 55401</label> </p>
					</div>
					<div class="col-md-6 contact-right">
								<form>
									<input type="text" value="Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Name';}">
									<input type="text" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}">
							
									<textarea onFocus="if(this.value == 'Message ') this.value='';"></textarea>
							
									<input type="submit" value="write to us" />
								</form>	
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!----//End-contact---->
		<!----start-footer---->
		<div class="footer text-center">
			<div class="container">
				<a href="#"> <img src="images/logo.png" title="miami" /></a>
				<p class="copy-right">Copyright &copy; 2014.Company name All rights reserved.<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
				<script type="text/javascript">
				$(document).ready(function() {
					/*
					var defaults = {
			  			containerID: 'toTop', // fading element id
						containerHoverID: 'toTopHover', // fading element hover id
						scrollSpeed: 1200,
						easingType: 'linear' 
			 		};
					*/
					
					$().UItoTop({ easingType: 'easeOutQuart' });
					
				});
			</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
			</div>
		</div>
		<!----//End-footer---->
		<!-----//End-container---->
 
  </body>
</html>
