public class BasicWorkoutPlan implements WorkoutPlan {
  @Override
  public String generateWorkout(User user) {
      StringBuilder workout = new StringBuilder();
      workout.append("Basic Workout Plan for " + user.getName() + ":\n");

      // Simple workout based on age and weight
      if (user.getAge() < 30) {
          workout.append("1. 30 minutes Cardio (Jogging)\n");
          workout.append("2. 3 sets of 15 Push-ups\n");
          workout.append("3. 3 sets of 20 Squats\n");
      } else {
          workout.append("1. 20 minutes Cardio (Walking)\n");
          workout.append("2. 3 sets of 10 Push-ups\n");
          workout.append("3. 3 sets of 15 Squats\n");
      }
      
      return workout.toString();
  }
}
