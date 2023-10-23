
import axios from 'axios'
import './App.css'
import { useEffect, useState } from 'react'

function App() {

  const [fruits, setFruits] = useState([{price: 0, name: ""}])

  useEffect(() => {
    axios
      .get('http://localhost:8080/api/getAllFruits')
      .then((res) => {
        console.log("RES: ", res.data)
        setFruits(res.data)
      })
      .catch((err) => {
        console.log("ERR: ", err)
      })
  }, [])

  return (
    <div className='w-screen h-screen bg-slate-900/70 text-white flex flex-col items-center justify-center gap-4'>
      <h1 className='font-bold text-3xl underline underline-offset-4'>My babies fruit size chart!</h1>
      <div className='w-3/4 flex flex-wrap items-center justify-center gap-2'>
        {
          fruits.map((fruit, idx) => (
            <p className='font-bold italic p-5 bg-blue-700 text-amber-400 shadow-lg shadow-white rounded-xl' key={idx}>Week {fruit.price}: Bennett is a {fruit.name}</p>
          ))
        }
      </div>
    </div>
  )
}

export default App
