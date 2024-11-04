// Select DOM elements
const hamburger = document.querySelector('.hamburger');
const mobileMenu = document.querySelector('.nav-list ul');
const menuItems = document.querySelectorAll('.nav-list ul li a');
const header = document.querySelector('.header.container');

// Toggle mobile menu visibility
const toggleMobileMenu = () => {
    hamburger.classList.toggle('active');
    mobileMenu.classList.toggle('active');
};

// Change header background color on scroll
const handleScroll = () => {
    header.style.backgroundColor = window.scrollY > 250 ? '#29323c' : 'transparent';
};

// Close mobile menu when a menu item is clicked
const closeMobileMenu = () => {
    if (hamburger.classList.contains('active')) {
        toggleMobileMenu();
    }
};

// Initialize event listeners
const initEventListeners = () => {
    hamburger.addEventListener('click', toggleMobileMenu);
    document.addEventListener('scroll', handleScroll);
    menuItems.forEach(item => item.addEventListener('click', closeMobileMenu));
};

// Initialize the script
initEventListeners();