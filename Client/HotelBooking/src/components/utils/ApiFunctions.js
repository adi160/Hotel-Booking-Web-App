import axios from "axios"

// Base backend URL
export const api = axios.create({
    baseURL: "http://localhost:8080"
})

// Add new to the database
export async function addRoom(photo, roomType, roomPrice) {
    const formData = new FormData()
    formData.append("photo", photo)
    formData.append("roomType", roomType)
    formData.append("roomPrice", roomPrice)

    const response = await api.post("/rooms/add/new-room", formData)
    if (response.status === 201) {
        return true
    } else {
        return false
    }
}

// Get all the room types from the database
export async function getRoomTypes() {
    try {
        const response = await api.get("/rooms/room/types")
        // console.log(response.data)
        return response.data
    }
    catch (error) {
        throw new Error("Error fetching room types")
    }
}