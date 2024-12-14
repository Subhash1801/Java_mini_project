public class AdvancedWorkoutPlan implements WorkoutPlan {
  @Override
  public String generateWorkout(User user) {
      StringBuilder workout = new StringBuilder();
      workout.append("Advanced Workout Plan for " + user.getName() + ":\n");

      // More intense workout plan for advanced users
      workout.append("1. 45 minutes HIIT (High Intensity Interval Training)\n");
      workout.append("2. 4 sets of 25 Push-ups\n");
      workout.append("3. 4 sets of 30 Squats\n");
      workout.append("4. 3 sets of Deadlifts (Moderate Weight)\n");

      return workout.toString();
  }
}
