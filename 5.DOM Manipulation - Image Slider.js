// Array of image paths
const images = [
  "image1.jpg",
  "image2.jpg",
  "image3.jpg",
  "image4.jpg"
];

// Get references to DOM elements
const sliderImage = document.getElementById("slider-image");
const prevButton = document.getElementById("prev-button");
const nextButton = document.getElementById("next-button");

// Initialize the current image index
let currentImageIndex = 0;

// Function to update the displayed image
function updateImage() {
  sliderImage.src = images[currentImageIndex];
}

// Event listener for the "Next" button
nextButton.addEventListener("click", () => {
  currentImageIndex = (currentImageIndex + 1) % images.length; // Loop back to the first image
  updateImage();
});

// Event listener for the "Previous" button
prevButton.addEventListener("click", () => {
  currentImageIndex = (currentImageIndex - 1 + images.length) % images.length; // Loop back to the last image
  updateImage();
});

// Initialize the slider with the first image
updateImage();
