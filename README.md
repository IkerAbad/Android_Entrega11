# Android_Entrega11

App Android en Kotlin (marzo-mayo de 2023, ciclo de DAM) que busca películas en la API de IMDb (`imdb-api.com`) y muestra los resultados.

## Qué hay

- Una sola actividad con navegación entre tres fragmentos: buscador (`search_movies`), lista de resultados (`list_movies`) y detalle de una película (`detail_movie`).
- `MoviesViewModel` con `LiveData` y corrutinas, `ListMoviesAdapter` para el listado y `Binding_adapters.kt` para cargar las imágenes con Glide.
- Llamada a la API con Retrofit y Moshi (`services/ApiServices.kt`).
- `minSdk 24`, `compileSdk 33`.

No he podido compilarla ni ejecutarla aquí: no tengo el SDK de Android en mi entorno de revisión. Además, el servicio de `imdb-api.com` pedía una clave propia y no sé si sigue funcionando.

## Cómo probarlo

La clave de la API ya no está en el código: en `ApiServices.kt`, la constante `BASE_URL` lleva el marcador `TU_API_KEY`, que hay que sustituir por tu clave. Después abre el proyecto en Android Studio y ejecútalo en un emulador o dispositivo.

## Licencia

MIT, ver [LICENSE](LICENSE).

---

# Android_Entrega11 (English)

An Android app in Kotlin (March to May 2023, DAM vocational course) that searches for movies in the IMDb API (`imdb-api.com`) and shows the results.

## What's inside

- A single activity with navigation between three fragments: search (`search_movies`), results list (`list_movies`) and a movie's detail (`detail_movie`).
- `MoviesViewModel` with `LiveData` and coroutines, `ListMoviesAdapter` for the list and `Binding_adapters.kt` to load images with Glide.
- API call with Retrofit and Moshi (`services/ApiServices.kt`).
- `minSdk 24`, `compileSdk 33`.

I could not build or run it here: I do not have the Android SDK in my review environment. Also, the `imdb-api.com` service needed its own key and I do not know whether it still works.

## Trying it

The API key is no longer in the code: in `ApiServices.kt`, the `BASE_URL` constant carries the `TU_API_KEY` placeholder, which you have to replace with your own key. Then open the project in Android Studio and run it on an emulator or device.

## License

MIT, see [LICENSE](LICENSE).
