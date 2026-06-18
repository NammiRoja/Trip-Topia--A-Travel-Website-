document.addEventListener('DOMContentLoaded', () => {
  const menuBar = document.getElementById('menu-bar');
  const navbar = document.querySelector('.navbar');

  if (menuBar && navbar) {
    // Toggle responsive menu
    menuBar.addEventListener('click', () => {
      navbar.classList.toggle('active');
    });

    // Close menu on link click (mobile)
    document.querySelectorAll('.navbar a').forEach(link => {
      link.addEventListener('click', () => {
        navbar.classList.remove('active');
      });
    });
  }
});
