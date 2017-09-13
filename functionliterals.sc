// 1. Finding even numbers from the list

val x = List.range(1, 10)

val even = x.filter((i: Int) => i % 2 == 0)
//This result can also achieved by using the below code
val evan = x.filter(_%2 == 0)


//2 .checking wether the name contains upper case

val name = "nikhil"

val isuppercase = name.exists(_.isUpper)

