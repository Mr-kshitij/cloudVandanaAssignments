// Array of image URLs
const images = [
    "https://via.placeholder.com/600x400/FF6347/FFFFFF?text=Image+1",
    "https://via.placeholder.com/600x400/32CD32/FFFFFF?text=Image+2",
    "https://via.placeholder.com/600x400/1E90FF/FFFFFF?text=Image+3"
];

let currentIndex = 0;

// Function to go to the next image
function nextImage() {
    currentIndex++;
    if (currentIndex >= images.length) {
        currentIndex = 0; // Loop back to the first image
    }
    updateSlider();
}

// Function to go to the previous image
function prevImage() {
    currentIndex--;
    if (currentIndex < 0) {
        currentIndex = images.length - 1; // Loop back to the last image
    }
    updateSlider();
}

// Function to update the image slider
function updateSlider() {
    const sliderImages = document.querySelector(".slider-images");
    sliderImages.style.transform = `translateX(-${currentIndex * 100}%)`;
}

// Initial display update
updateSlider();
