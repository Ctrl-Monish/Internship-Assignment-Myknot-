# Internship-Assignment-Myknot-
Call an API using Post method. Implementing swipe to dismiss dialogue box from a non-Activity class.

● Please create an Empty Screen

● Call this API (POSTMethod) https://backend-test-zypher.herokuapp.com/testData ( once screen
loads - oncreate())

Once Response comes
● Show Responses variable - title as Dialog Box title and Image as dialog Box Image

● The Dialog Box can be swipable and closable on swipe.

● One Success button is Clicked, Open Browser and navigate to SUCCESS_URL

Notes:
The codes to invoke/show dialog box must be present in another class
The Dialog Box Constructor must be in another class / Activity ( Preferably from a singleTon
invoking)
Eg.
OnResponseReceived(JSON response) {
ClassB.showDialogBox(response.title, response.image)
}
Class B must be present in another file and not in the same activity
Dialog Box Template - Attached in Screen 2
Once completed, Please share
1. Screenshot/video of your implementation
2. Github link to your task
Deadline : 30th April, 6PM
