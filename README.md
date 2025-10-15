Part1
# Bouncing Text Applet

A nostalgic Java Applet that demonstrates animated bouncing text using the `Applet` class and `Runnable` interface. This applet displays a first name and last name moving horizontally across the screen with simple animation.

---

## Features

- Displays a first name (`Robel`) and last name (`Shiferaw`) in different colors.
- Animates the text horizontally across the applet window.
- Uses multithreading (`Runnable`) to control smooth animation.
- Background color: Black, text colors: Cyan and Green.
- Font: Bold SansSerif, size 24.

---

## Screenshots

*(Add a screenshot here if you run it using appletviewer)*

---

## Requirements

- **Java Development Kit (JDK)** (any version supporting Applets, e.g., JDK 8)
- An **older web browser** with Java plugin support **or** the `appletviewer` tool (recommended).

> **Note:** Java Applets are deprecated and are **not supported** in modern browsers.

---

## How to Run

### Using `appletviewer` (Recommended)


1. Compile the Java code:

```bash
javac BouncingTextApplet.java
```
Part2
The Critical Analysis
=====================

1. Security:
------------
Based on the "sandbox" model, Java applets run in a restricted environment to protect your computer. Two things an applet would NOT be allowed to do are:

- Access local files on your computer without explicit permission.
- Open network connections to arbitrary servers (outside of the server it was loaded from).

2. Modern (Modern Replacement):
-------------------------------
Java Applets have been completely replaced by modern web technologies such as:

- HTML (for structure)
- CSS (for styling)
- JavaScript (for interactivity)

Example: Creating a simple bouncing text animation using HTML, CSS, and JavaScript:

HTML:
<div id="bouncingText">Hello World!</div>

CSS:
#bouncingText {
  position: absolute;
  top: 50px;
  left: 0px;
  font-size: 24px;
  color: cyan;
}

JavaScript:
let x = 0;
let direction = 1;
const text = document.getElementById("bouncingText");
function animate() {
  x += 5 * direction;
  if (x > window.innerWidth - text.offsetWidth || x < 0) direction *= -1;
  text.style.left = x + "px";
  requestAnimationFrame(animate);
}
animate();

3. Legacy:
----------
Even though applets are deprecated, it is important for developers to know what applets are because:

- Many legacy systems and old educational examples still use applets.
- Understanding applets helps in learning about sandbox security models and early web-based GUI programming.
- Knowledge of applets can be useful when maintaining or migrating older Java applications to modern technologies.


