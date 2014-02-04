Step 1: Prepare Your App Materials
Download the provided app materials, assignment2-webcontent.zip (725KB)and extract the contents of the zip file. If you are using a zip extraction tool make sure you preserve the directory structure.

The zip file contains 4 items:

An extract of War of the Worlds by H.G. Wells
Jabberwocky by Lewis Carroll
"U of I at NASA" by Lawrence Angrave
Roundball, a javascript game from limejs.com
You will also need to perform a web search to find or create a short (e.g. 30 second) mp3 file and a picture (gif, jpg or png format). The picture will be used in the Jabberwocky activity. The audio file will be played repeatedly using Android's MediaPlayer while the user views Jabberwocky activity to add some sound effects or ambiance or background music to the scary poem.

Step 2: Create Your App
Requirements:

For privacy, the package name should not include your real name. Remember to use the format abc.def (lowercase words, separated with periods).
The app icon and name is up to you but should represent the contents of the app in some simple way.
The minimum SDK value should be 10.
Create 4 activities; one for each of the 4 items listed above. Each activity will use a WebView to display the locally-stored files.
Hint: One of these items may need Javascript and DomStorage enabled to function correctly. Some Internet sleuthing may be required to learn how to enable these settings. 
You will also need to add the INTERNET permission to your app.
Each activity will have a relevant name and will also appear in the Launcher (HOME) window.
Constrain each activity to run in portrait orientation only.
Play your mp3 file only when the user is viewing Jabberwocky otherwise the app should be silent.
The Jabberwocky activity will also include two buttons beneath the web view:
The first button will use an Intent to open the Jabberwocky Wikipedia page in an external browser. The second button will use WebView's 'loadURL' method to change the web view to display a picture of your choice. For example, the picture could be a drawing of the frumious beast. Hint: web views can display jpg files directly or you can create a html page that includes an 'img' element. 
Step 3: Refine and Test Your App
Check for the following:

Find one page in your app that requires INTERNET permission to function correctly.
Step 4: Capture Screenshots to Submit
Use the screenshot functionality in the Eclipse Devices view to take 4 screen capture pictures directly from the running device or emulator. Do not use your Windows/Mac/Linux screen capture tool.

Take 1 screen capture of each of the 4 activities running in portrait mode on a [1024 x 600 mdpi] screen.
Note: The screenshot of the Jabberwocky activity should show the poem, not the image.
Step 5: Export Your App
Export your app as a signed apk file. The apk file should be valid for at least 50 years. 
Hint: You will need to create a key and keystore if you have not already done so.