import cv2
import matplotlib.pyplot as plt

# Load an image from file
originalmage = cv2.imread("C:\Users\chand\OneDrive\Pictures\passportpic.jpg")

# Convert the image from BGR to RGB
originalmage = cv2.cvtColor(originalmage, cv2.COLOR_BGR2RGB)

# Display the image using Matplotlib
plt.imshow(originalmage)
plt.axis('off')  # Hide the axis
plt.show()