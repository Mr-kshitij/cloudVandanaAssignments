const images = [
    "https://www.w3schools.com/w3images/fjords.jpg",
    "https://www.w3schools.com/w3images/lights.jpg",
    "https://www.w3schools.com/w3images/mountains.jpg"
];

let currentIndex = 0;

function nextImage() {
    currentIndex++;
    if (currentIndex >= images.length) {
        currentIndex = 0; // Loop back to the first image
    }
    updateSlider();
}

function prevImage() {
    currentIndex--;
    if (currentIndex < 0) {
        currentIndex = images.length - 1; // Loop back to the last image
    }
    updateSlider();
}

function updateSlider() {
    const sliderImages = document.querySelector(".slider-images");
    sliderImages.style.transform = `translateX(-${currentIndex * 100}%)`;
}

updateSlider();
