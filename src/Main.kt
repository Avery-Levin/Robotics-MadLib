//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Introduction
    println("What is your name?")
    val nameOfUser = readln().capitalize()
   println("Hello, $nameOfUser. Welcome to the shittiest robotics MadLib that has ever existed! What will happen is I will give you a part of speech (or potentially something more specific than that) and you will give me a word that corresponds with that part of speech. I will use these words to create a paragraph, which you won't be able to see until the end. Let's begin! (press enter to continue)")
    readln()
   //User Input
  /* println("Name of a University")
   val university = readln().capitalize()
   println("Sport")
   val sport = readln()
   println("U.S. State")
   val state = readln().capitalize()
   println("Noun")
   val noun1 = readln().capitalize()
   println("A verb ending in -ing ")
   val gerund = readln().capitalize()
   println("Any word that starts with the same letter as the previous word")
   val activity = readln().capitalize()
    println("Integer")
    val int1 = readln()
   println("Integer")
   val int3 = readln()
    println("Integer")
    val int4 = readln()
    println("Integer")
    val int5 = readln()
    println("Integer")
    val int6 = readln()
    println("Integer")
    val int7 = readln()
    println("Integer")
    val int8 = readln()
    println("Integer")
    val int9 = readln()
    println("Integer")
    val int2 = readln()
    println("Noun")
    val noun2 = readln()
    println("A word that ends in -ers, such as Raiders")
    val ersWord = readln().capitalize()
    println("Adjective")
    val adj1 = readln().capitalize()
    println("The name of the robotics team you are currently on")
    val teamOfUser = readln()
    println("A current world leader")
    val worldLeader = readln().capitalize()
    println("A previous year")
    val previousYear = readln()
    println("A short word")
    val shortWord1 = readln().capitalize()
    println("A short word")
    val shortWord2 = readln().capitalize()
    println("A short word")
    val shortWord3 = readln().capitalize()
    println("Finally, name a city")
    val City = readln().capitalize() */
		var prompts = listOf(“Name of a University, “Sport”, “U.S. State”, “Noun”, “A verb ending in -ing, “Any word that starts with the same letter as the previous word”, “integer”, “integer”, “integer”, “integer”, “integer”, “integer”, “integer”, “integer”, “integer”, “noun”, “A word that ends in -ers, such as Raiders”, “Adjective”, “The name of the robotics team you are currently on”, “A current world leader”, “A previous year”, “A short word”, “A short word”, “A short word”, “Finally, name a city.”)
		var answers = mutableListOf()
		for(index in prompts){
			println(prompts[index - 1]
			answers[index - 1] = readln()
// Final Result
    println("Earlier today, in the $university's $sport stadium, robotics teams from around $state gathered to compete in the FIRST $noun1 Challenge state championship. This year's game was known as $gerund $activity . There were $int1 teams competing here today. \n There was a shocking turn of events during the qualification matches. Team number $int2, known as the $noun2 $ersWord, who were widely expected to place first, ranked only $int3. Conversely, team $int4 known as the $adj1 Roboticists of $state, came out on top. \n During the elimination matches, teams $int4, $int5, $int6, and $int7 were the alliance captains. Teams $int4 and $int6 won their respective matches and went on to finals. However, driver $nameOfUser of team $teamOfUser demanded that their team be allowed to play. Head referee $worldLeader objected to this, and $nameOfUser was ejected from the venue like what happened in $previousYear. However, the competition was so behind schedule at this point that finals were canceled. \n Several more upsets occurred during the awards ceremony. Thanks to their outreach efforts, team $int8 won the $shortWord1 Award. The innovative design of team $int6 got them the $shortWord2 award. Finally, due to their overall performance today, team $int9 won the very prestigious $shortWord3 award, advancing them to the FIRST Championship in $City.")

}