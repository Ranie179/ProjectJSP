<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Design by foolishdeveloper.com -->
    <title>Sign in-Sign up</title>
 
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <style media="screen">
      *,
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body{
    background-color: #FFB6C1
;
}
.background{
    width: 430px;
    height: 520px;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;
}
.background .shape{
    height: 200px;
    width: 200px;
    position: absolute;
    border-radius: 50%;
}
.shape:first-child{
    background: linear-gradient(
        #1845ad,
        #23a2f6
    );
    left: -80px;
    top: -80px;
}
.shape:last-child{
    background: linear-gradient(
        to right,
        #ff512f,
        #f09819
    );
    right: -30px;
    bottom: -80px;
}
.bg-img {
  /* The image used */
  background-image: url("panda.png");

  /* Control the height of the image */
  min-height: 600px;

  /* Center and scale the image nicely */
  background-position: 690px;
  background-repeat: no-repeat;
  background-size: 500px;
  position: relative;
}
.bg-img2 {
	background-image: url("tiger.png");
  /* Control the height of the image */
  min-height: 620px;

  /* Center and scale the image nicely */
  background-repeat: no-repeat;
  top: 100px;
  left: 100px;
  background-size: 420px;
  position: relative;
}
form{
    height: 600px;
    width: 400px;
    background-color: rgba(255,255,255,0.13);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 30px 35px;
}
form *{
    font-family: 'Poppins',sans-serif;
    color: #000000;
    letter-spacing: 0.5px;
    outline: none;
    border: none;
}
form h3{
    font-size: 32px;
    font-weight: 500;
    line-height: 20px;
    text-align: center;
}

label{
    display: block;
    margin-top: 30px;
    font-size: 16px;
    font-weight: 500;
}
input{
    display: block;
    height: 50px;
    width: 100%;
    background-color: rgba(255,255,255,0.07);
    border-radius: 3px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 14px;
    font-weight: 300;
}
::placeholder{
    color: #e5e5e5;
}
button{
    margin-top: 50px;
    width: 100%;
    background-color: #ffffff;
    color: #080710;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius: 5px;
    cursor: pointer;
}
.social{
  margin-top: 30px;
  display: flex;
}
.social div{
  background: red;
  width: 150px;
  border-radius: 3px;
  padding: 5px 10px 10px 5px;
  background-color: rgba(255,255,255,0.27);
  color: #000000;
  text-align: center;
}
.social div:hover{
  background-color: rgba(255,255,255,0.47);
}
.social .fb{
  margin-left: 25px;
}
.social i{
  margin-right: 4px;
}

:root {
    --text: #000000;
    --line: #ffff00;
    --line-active: #275EFE;
}

p {
    font-size: 18px;
    margin: 0;
    color: var(--text);
    a {
        display: inline-block;
        position: relative;
        text-decoration: none;
        color: inherit;
        margin: 0 var(--spacing, 0px);
        transition: margin .25s;
        svg {
            width: 76px;
            height: 40px;
            position: absolute;
            left: 50%;
            bottom: 0;
            transform: translate(-50%, 7px) translateZ(0);
            fill: none;
            stroke: var(--stroke, var(--line));
            stroke-linecap: round;
            stroke-width: 2px;
            stroke-dasharray: var(--offset, 69px) 278px;
            stroke-dashoffset: 361px;
            transition: stroke .25s ease var(--stroke-delay, 0s), stroke-dasharray .35s;
        }
        &:hover {
            --spacing: 4px;
            --stroke: var(--line-active);
            --stroke-delay: .1s;
            --offset: 180px;
        }
    }
}

 .checkbox-wrapper-54 input[type="checkbox"] {
    visibility: hidden;
    display: none;
  }

  .checkbox-wrapper-54 *,
  .checkbox-wrapper-54 ::after,
  .checkbox-wrapper-54 ::before {
    box-sizing: border-box;
  }

  /* The switch - the box around the slider */
  .checkbox-wrapper-54 .switch {
    --width-of-switch: 3.5em;
    --height-of-switch: 2em;
    /* size of sliding icon -- sun and moon */
    --size-of-icon: 1.4em;
    /* it is like a inline-padding of switch */
    --slider-offset: 0.3em;
    position: absolute;
    width: var(--width-of-switch);
    height: var(--height-of-switch);
    display: inline-block;
  }

  /* The slider */
  .checkbox-wrapper-54 .slider {
    position: absolute;
    cursor: pointer;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    background-color: #f4f4f5;
    transition: .4s;
    border-radius: 30px;
  }

  .checkbox-wrapper-54 .slider:before {
    position: absolute;
    content: "";
    height: var(--size-of-icon,1.4em);
    width: var(--size-of-icon,1.4em);
    border-radius: 20px;
    left: var(--slider-offset,0.3em);
    top: 50%;
    transform: translateY(-50%);
    background: linear-gradient(40deg,#ff0080,#ff8c00 70%);
    ;
   transition: .4s;
  }

  .checkbox-wrapper-54 input:checked + .slider {
    background-color: #303136;
  }

  .checkbox-wrapper-54 input:checked + .slider:before {
    left: calc(100% - (var(--size-of-icon,1.4em) + var(--slider-offset,0.3em)));
    background: #303136;
    /* change the value of second inset in box-shadow to change the angle and direction of the moon  */
    box-shadow: inset -3px -2px 5px -2px #8983f7, inset -10px -4px 0 0 #a3dafb;
  }

    </style>
</head>
<body>
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <div class="bg-img">
    <div class="bg-img2">
    </div>
    <form action = "login" method = "post">
        <h3>Login Here</h3>

        <label for="username">Username</label>
        <input type="text" placeholder="Username" id="Username" name = "Username">

        <label for="password">Password</label>
        <input type="password" placeholder="Password" id="Password" name = "Password">
        <button type = "submit">Log In</button>
        <div class="checkbox-wrapper-54">
		  <label class="switch">
    		<input type="checkbox" id = "check" name = "check">
    		<span class="slider"></span>
  		 </label>
		</div>
		<br>
		<br>
		<p>&emsp;&emsp;&emsp;&ensp;Remember me?</p>
        <br>	
		<br>
   		<p>
   		 Don't have account?
    		<a href="Register.jsp">
        		Sign up
    		</a>
    			here
		</p>
        <div class="social">
          <div class="go"><i class="fab fa-google"></i>  Google</div>
          <div class="fb"><i class="fab fa-facebook"></i>  Facebook</div>
        </div>
    </form>
    </div>
</body>
</html>
