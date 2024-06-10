 
Imad5112: Practicum (Exam)
ST10447252
Angel Khumalo | Weather App | 10 June 10, 2024 
Purpose/Explanation
I have joined a team of developers working on a weather app for a local weather organization. They need an application that not only provides the average temperature for the week but also allows users to view detailed information for each day. I am tasked to design an android app that will manage weekly weather conditions.
PSUEDOCODE/LOGICAL PLANNING
0.start
1.declarations
   num intSIZE = 7   //a constant variable
   string strDay[intSIZE] = "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
   num intWeatherMin[intSIZE] //an array that will store user input data
   num intWeatherMax[intSIZE]  //an array that will store user input data
   string strWeatherCondition[intSIZE] //an array that will store user data
   
   string strUserInput_Day  //user input to store a single value
   num intUserInput_WeatherMin  //variable to store minimum weather
   num intUserInput_WeatherMax  //variable to store maximum weather 
   string strUserInputWeatherCondition //variable to store weather condition
   string strisValid = "Y" or "N"

   num intTotalForecast  //a value that will store the total weather forecast
   num fltAverageForecast //a value that will store the average forecast  

   intCount = 0 //subscript loop increment 

2. captureDay() // a function that will capture the day of the week
3. captureWeatherMin() //a function that will capture the minimum weather
4. captureWeatherMax()  //a function that will capture the maximum weather 
5. captureWeatherConditions() //a function that will capture the weather conditions 

6. intTotalForecast = (intWeatherMin * intSIZE) + (intWeatherMax * intSIZE) //calculating the forecast
7. fltAverageForecast = intTotalForecast / intSIZE

8.  output "Day" + strDay  //output the day of the week
9.  output "minimun weather forecast is" + intWeatherMin //output the minimum weather for that day
10. output "maximum weather forecast is" + intWeatherMax  //ouput the maximum weather for that day
11. output "todays weather is" + strWeatherCondition  //output the weather condition
12. output "the average weather forecast for the week is" + fltAverageForecast

12.stop
---------------------------------------------------------------------------------------------
0.captureDay()
1. declarations 
   string strUserInput_Day  //local variable that stores user input data
   string strisValid = "Y" or "N"  //local variable to check if its correct

2. while intCount < intSIZE do //run a while loop to get data 
3.    output "please enter the day of the week"
4.    input strUserInput_Day

5.   if strUserInput_Day = "Y" then
6.       strUserInput_Day = strDay[] //store the user data in the array
8.   else
9.      output "please enter a correct day"
10.  endif

11. endwhile

12.return
--------------------------------------------------------------------------------------------
0.captureWeatherMin()
1. declarations 
   string intUserInput_WeatherMin  //local variable that stores user input data
   string strisValid = "Y" or "N"  //local variable to check if its correct

2. while intCount < intSIZE do //run a while loop to get data 
3.    output "please enter the minumum weather for today"
4.    input strUserInput_WeatherMin

5.   if intUserInput_WeatherMin = "Y" then
6.      intUserInput_WeatherMin = intWeatherMin[] //store the user data in the array
7.   else
8.       output "please enter the correct weather"
9.   endif
10. endwhile

11.return
-------------------------------------------------------------------------------------------
0.captureWeatherMax()
1. declarations 
   string intUserInput_WeatherMax //local variable that stores user input data
   string strisValid = "Y" or "N"  //local variable to check if its correct

2. while intCount < intSIZE do //run a while loop to get data 
3.    output "please enter the minumum weather for today"
4.    input intUserInput_WeatherMax

5.   if intUserInput_WeatherMax = "Y" then
6.       intUserInput_WeatherMax = intWeatherMax[] //store the user data in the array
7.   else
8.       output "please enter the correct weather"
9.   endif
10. endwhile

11.return
--------------------------------------------------------------------------------------------
0.captureWeatherCondition()
1. declarations 
   string strUserInput_WeatherCondition  //local variable that stores user input data
   string strisValid = "Y" or "N"  //local variable to check if its correct

2. while intCount < intSIZE do //run a while loop to get data 
3.    output "please enter the minumum weather for today"
4.    input strUserInput_WeatherCondition

5.   if strUserInput_WeatherCondition = "Y" then
6.       strUserInput_WeatherCondtion = strWeatherCondition[] //store the user data in the array
7.   
8.   endif
9. endwhile

10.return
Design and App Ideology.

 
The application uses simple text and display that utilizes the structure of the app, the use will be greeted with a splash screen that will welcome them to the app, there are two buttons that navigate either to the next page or exit the application.
The second page will prompt the user to enter the necessary information that will be captured, there are three buttons that will help the user add, clear if there are mistakes or take them to the third page of the application.
The third page will make use of the user input to display all weather forecast information that will give clear detail on weather.


GitHub/GitHub Actions 
GitHub Link: https://github.com/ST10447252/WeatherApp.git
GitHub Actions

Android YML. and Android Build.
 
 

Reference list
1.	Figma (2024). Copyright © 2024 Adobe. All rights reserved. Application used for designing.
2.	Adobe. (2022). Illustrator. Copyright © 2022 Adobe. All rights reserved. Application used for drawing pet.
3.	Android Developers. (n.d.). arrays. Retrieved from https://developer.android.com/reference/android/widget/Arrays
4.	Android Developers. (n.d.). Coroutines. Retrieved from https://developer.android.com/kotlin/Arrays
5.	Android Developers. (n.d.). Use coroutines for main safety. Retrieved from https://developer.android.com/kotlin/coroutines#use-coroutines-for-main-safety
6.	Android Developers. (n.d.). Animations overview. Retrieved from https://developer.android.com/develop/ui/views/animations/overview
7.	Android Developers. (n.d.). Transitions between activities. Retrieved from https://developer.android.com/develop/ui/views/animations/transitions/start-activity
8.	Android Developers. (n.d.). Gradle API. Retrieved from https://developer.android.com/reference/tools/gradle-api
9.	Android Developers. (n.d.). AnimatedImageDrawable. Retrieved from https://developer.android.com/reference/android/graphics/drawable/AnimatedImageDrawable
10.	Android Developers. (n.d.). Color. Retrieved from https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color
11.	Android Developers. (n.d.). Color. Retrieved from https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color
12.	Android Developers. (n.d.). UI. Retrieved from https://developer.android.com/develop/ui
Android Developers. (2024, April 4). Timer. Retrieved from https://developer.android.com/reference/androidx/appsearch/builtintypes/Timer
