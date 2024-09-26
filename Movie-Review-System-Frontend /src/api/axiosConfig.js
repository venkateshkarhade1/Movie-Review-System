import axios from 'axios';

export default axios.create({
  // No need for baseURL since requests will be proxied through localhost
  headers: {
    "Content-Type": "application/json"
  }
});
