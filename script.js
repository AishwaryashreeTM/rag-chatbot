document.addEventListener("DOMContentLoaded", function() {
    const chatBox = document.getElementById("chat-box");
    const chatForm = document.getElementById("chat-form");
    const userInput = document.getElementById("user-input");

    // Function to add a new chat message to the chat box
    function addChatMessage(message, isUser) {
        const chatMessage = document.createElement("div");
        chatMessage.classList.add("chat-message");
        chatMessage.textContent = message;
        if (isUser) {
            chatMessage.classList.add("user-message");
        }
        chatBox.appendChild(chatMessage);
        // Scroll to the bottom of the chat box
        chatBox.scrollTop = chatBox.scrollHeight;
    }

    // Event listener for submitting the chat form
    chatForm.addEventListener("submit", function(event) {
        event.preventDefault();
        const userMessage = userInput.value;
        // Add the user's message to the chat box
        addChatMessage("You: " + userMessage, true);
        // Clear the user input field
        userInput.value = "";
        // Send the user's message to the backend for processing (you would implement this part)
        // For demonstration purposes, let's assume the response is received synchronously
        const botResponse = "This is a sample response from the bot for the message: " + userMessage;
        // Add the bot's response to the chat box
        addChatMessage("Bot: " + botResponse, false);
    });
});
