document.getElementById("workoutForm").addEventListener("submit", function (event) {
  event.preventDefault();

  const formData = new FormData(event.target);
  const data = new URLSearchParams(formData);

  fetch("/generateWorkout", {
      method: "POST",
      body: data
  })
  .then(response => response.text())
  .then(data => {
      document.getElementById("workoutResult").style.display = "block";
      document.getElementById("resultText").textContent = data;
  })
  .catch(error => {
      console.error('Error:', error);
  });
});
