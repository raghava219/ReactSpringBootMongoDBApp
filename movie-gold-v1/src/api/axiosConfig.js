import axios from "axios";

export default axios.create({
  baseURL: "https://e54c-49-207-198-73.in.ngrok.io",
  headers: {
    "ngrok-skip-browser-warning": "any",
    "Access-Control-Allow-Origin": "*",
    "Content-Type": "application/json",
    "Access-Control-Allow-Methods": "GET, POST, OPTIONS",
    /*"Access-Control-Allow-Origin": "http://localhost:3000",
    "Access-Control-Allow-Credentials": "true",
    "Access-Control-Allow-Headers": "Origin, Content-Type, Accept"*/
  },
});
