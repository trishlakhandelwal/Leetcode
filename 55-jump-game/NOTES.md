Start from the end of the list i.e. traverse backwards from the goal to the start of the array
Keep updating goal, if i+nums[i]>= goal, goal = i
once the loop terminates, if goal == 0, you have reached the first element, so return true
else return false
