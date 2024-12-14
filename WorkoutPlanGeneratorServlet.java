import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WorkoutPlanGeneratorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve user data from form submission
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        double height = Double.parseDouble(request.getParameter("height"));
        double weight = Double.parseDouble(request.getParameter("weight"));
        String gender = request.getParameter("gender");

        // Create user object
        User user = new User(name, age, height, weight, gender);

        // Create a workout plan based on user data
        WorkoutPlan workoutPlan;
        if (age < 30) {
            workoutPlan = new AdvancedWorkoutPlan(); // Assign advanced plan if under 30
        } else {
            workoutPlan = new BasicWorkoutPlan(); // Basic workout plan for older age
        }

        // Generate workout plan
        String workout = workoutPlan.generateWorkout(user);

        // Send workout plan to response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Generated Workout Plan</h2>");
        out.println("<pre>" + workout + "</pre>");
        out.println("</body></html>");
    }
}
