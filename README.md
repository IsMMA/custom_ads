# CustomAds for Android
SnackBar creator module for Android like Pokémon Go.

How to use:


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.IsMMA:custom_ads:1.0.1'
	}



And:

 	private MagicSnackBar magicSnackBar;
 
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
		...
	
        
       
        
  

		//Instance
		CustomAds customAds = new CustomAds(this);
		
		//Set description of your ad
		customAds.setDescripcion("Courstube, cursos gratis de todo tipo. Descarga la APP gratis");
		
		//Set icon or image of your app/web ...
		 customAds.setImage(R.drawable.ic_launcher_background);
		
		//Set URL of your link
		customAds.setURLButton("https://play.google.com/store/apps/details?id=com.courstube");
    
    //And show the ad:
    customAds.show();
		
		...
	    }

Only works with Love ❤️
