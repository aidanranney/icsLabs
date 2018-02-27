$(document).ready(function(){

  var count;
  var userName;

/* Check every element in the form for radio buttons that have been checked.
If the checked button is "true", increment count.
If less than five buttons have been checked, throw an error. */
  function isCorrect() {
    var form = document.getElementById("quiz").elements;
    var checked = 0;

    for (var i = 0; i < form.length; i++) {
      if (form[i].checked) {
        checked++;
        if (form[i].value == "true"){
          count++;
        }
      }
    }
    if (checked < 5) {
      alert("You must answer every question");
      throw console.error();
    }
  }

  //Save user's name to local storage
  function saveUsername(name) {
    localStorage.setItem('userName', name);
    console.log("saving user name: " + userName);
  }

//Save the current score to local storage
  function saveScore() {
    localStorage.setItem('score', count);
    console.log("saving score: " + count);
  }


  $("#button").click(function(){
    count = 0;

    isCorrect();

    $("#redScore").fadeIn(3000).html("<b>You scored " + count + " out of 5</b>");
    $("#yellowScore").fadeIn(3000).html("<h3>RESULTS: You scored " + count + " out of 5</h3>");

    var name = localStorage.getItem('userName');
    userName = prompt("Please enter your name: ");

/* Checking for previous users. If the same person submits the quiz as before, their high score is tracked.
If there is a new user, local storage will be overwritten */
    if (name == null) {
      saveUsername(userName);
      saveScore();
    } else if (name == userName) {
        console.log("User is still: " + userName);
        var score = localStorage.getItem('score');
        if (count > score) {
        saveScore();
        $("#highScore").fadeIn(2000).html("<h4>That's your best score!</h4>").fadeOut(3000);
      }
    } else {
      saveUsername(userName);
      saveScore();
    }

  });

});
