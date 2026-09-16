package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Assignment
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.ShowChart
import androidx.compose.material.icons.filled.TaskAlt
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


// ============================================================
// COLORES DE CAMPUS AUTÓNOMA
// ============================================================

val CampusBlue = Color(0xFF3DBFF2)
val CampusDarkBlue = Color(0xFF063B70)
val CampusBlueDark = Color(0xFF146FA5)
val CampusLightBlue = Color(0xFFEAF8FF)

val GlassWhite = Color.White.copy(alpha = 0.58f)
val GlassWhiteStrong = Color.White.copy(alpha = 0.72f)
val GlassBorder = Color.White.copy(alpha = 0.88f)


// ============================================================
// MAIN ACTIVITY
// ============================================================

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            MaterialTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = CampusLightBlue
                ) {

                    CampusAutonomaApp()
                }
            }
        }
    }
}


// ============================================================
// APLICACIÓN PRINCIPAL
// ============================================================

@Composable
fun CampusAutonomaApp() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFF9FDFF),
                        Color(0xFFDFF6FF),
                        Color(0xFFBDEBFF),
                        Color(0xFFEAF8FF)
                    )
                )
            )
    ) {

        // ----------------------------------------------------
        // DECORACIONES DEL FONDO
        // ----------------------------------------------------

        FondoDecorativo()

        // ----------------------------------------------------
        // CONTENIDO
        // ----------------------------------------------------

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 28.dp
                    )
            ) {

                HeaderCampus()

                Spacer(
                    modifier = Modifier.height(24.dp)
                )

                SaludoEstudiante()

                Spacer(
                    modifier = Modifier.height(22.dp)
                )

                ProximaClase()

                Spacer(
                    modifier = Modifier.height(24.dp)
                )

                Text(
                    text = "Accesos rápidos",
                    fontSize = 21.sp,
                    fontWeight = FontWeight.Bold,
                    color = CampusDarkBlue
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                AccesosRapidos()

                Spacer(
                    modifier = Modifier.height(22.dp)
                )

                RendimientoAcademico()

                Spacer(
                    modifier = Modifier.height(22.dp)
                )

                TarjetaMotivacional()

                Spacer(
                    modifier = Modifier.height(20.dp)
                )
            }

            BarraNavegacion()
        }
    }
}


// ============================================================
// FONDO DECORATIVO
// ============================================================

@Composable
fun FondoDecorativo() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        // Círculo superior izquierdo
        Box(
            modifier = Modifier
                .size(260.dp)
                .offset(
                    x = (-100).dp,
                    y = (-80).dp
                )
                .clip(CircleShape)
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            CampusBlue.copy(alpha = 0.45f),
                            CampusBlue.copy(alpha = 0.08f),
                            Color.Transparent
                        )
                    )
                )
        )

        // Círculo superior derecho
        Box(
            modifier = Modifier
                .size(300.dp)
                .offset(
                    x = 250.dp,
                    y = (-40).dp
                )
                .clip(CircleShape)
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            Color.White.copy(alpha = 0.8f),
                            CampusBlue.copy(alpha = 0.12f),
                            Color.Transparent
                        )
                    )
                )
        )

        // Círculo inferior
        Box(
            modifier = Modifier
                .size(320.dp)
                .offset(
                    x = (-130).dp,
                    y = 650.dp
                )
                .clip(CircleShape)
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            CampusBlue.copy(alpha = 0.30f),
                            Color.Transparent
                        )
                    )
                )
        )

        // Mancha azul inferior derecha
        Box(
            modifier = Modifier
                .size(300.dp)
                .offset(
                    x = 260.dp,
                    y = 650.dp
                )
                .clip(CircleShape)
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            CampusBlue.copy(alpha = 0.35f),
                            Color.Transparent
                        )
                    )
                )
        )
    }
}


// ============================================================
// HEADER
// ============================================================

@Composable
fun HeaderCampus() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // LOGO
        Box(
            modifier = Modifier
                .size(76.dp)
                .shadow(
                    elevation = 10.dp,
                    shape = CircleShape,
                    ambientColor = CampusBlue.copy(alpha = 0.25f),
                    spotColor = CampusBlue.copy(alpha = 0.30f)
                )
                .clip(CircleShape)
                .background(
                    Color.White.copy(alpha = 0.65f)
                )
                .border(
                    width = 1.5.dp,
                    color = GlassBorder,
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(
                    id = R.drawable.logo_campus
                ),
                contentDescription = "Logo Campus Autónoma",
                modifier = Modifier
                    .size(62.dp),
                contentScale = ContentScale.Fit
            )
        }

        Spacer(
            modifier = Modifier.width(12.dp)
        )

        Column(
            modifier = Modifier.weight(1f)
        ) {

            Text(
                text = "Campus",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = CampusDarkBlue
            )

            Text(
                text = "Autónoma",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = CampusBlue
            )

            Text(
                text = "Corporación Universitaria Autónoma del Cauca",
                fontSize = 8.sp,
                color = CampusDarkBlue.copy(alpha = 0.85f)
            )
        }

        // NOTIFICACIONES

        Box(
            modifier = Modifier
                .size(45.dp)
                .shadow(
                    elevation = 8.dp,
                    shape = CircleShape,
                    ambientColor = CampusBlue.copy(alpha = 0.18f)
                )
                .clip(CircleShape)
                .background(
                    GlassWhite
                )
                .border(
                    1.dp,
                    GlassBorder,
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Notificaciones",
                tint = CampusDarkBlue,
                modifier = Modifier.size(25.dp)
            )
        }

        Spacer(
            modifier = Modifier.width(8.dp)
        )

        // PERFIL

        Box(
            modifier = Modifier
                .size(45.dp)
                .shadow(
                    elevation = 8.dp,
                    shape = CircleShape,
                    ambientColor = CampusBlue.copy(alpha = 0.18f)
                )
                .clip(CircleShape)
                .background(
                    GlassWhiteStrong
                )
                .border(
                    1.dp,
                    GlassBorder,
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Perfil",
                tint = CampusBlue,
                modifier = Modifier.size(28.dp)
            )
        }
    }
}


// ============================================================
// SALUDO
// ============================================================

@Composable
fun SaludoEstudiante() {

    Column {

        Text(
            text = "Hola, Didier 👋",
            fontSize = 31.sp,
            fontWeight = FontWeight.Bold,
            color = CampusDarkBlue
        )

        Spacer(
            modifier = Modifier.height(4.dp)
        )

        Text(
            text = "Bienvenido a tu campus estudiantil",
            fontSize = 17.sp,
            color = CampusDarkBlue.copy(alpha = 0.85f)
        )
    }
}


// ============================================================
// TARJETA PRÓXIMA CLASE
// ============================================================

@Composable
fun ProximaClase() {

    GlassCard(
        modifier = Modifier
            .fillMaxWidth()
            .height(175.dp)
    ) {

        Column {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                GlassIcon(
                    icon = Icons.Default.CalendarMonth
                )

                Spacer(
                    modifier = Modifier.width(10.dp)
                )

                Text(
                    text = "Próxima clase",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = CampusDarkBlue
                )
            }

            Spacer(
                modifier = Modifier.height(14.dp)
            )

            Text(
                text = "Ingeniería de Software",
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold,
                color = CampusDarkBlue
            )

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Icon(
                    imageVector = Icons.Default.CalendarMonth,
                    contentDescription = "Hora",
                    tint = CampusBlue,
                    modifier = Modifier.size(21.dp)
                )

                Spacer(
                    modifier = Modifier.width(7.dp)
                )

                Text(
                    text = "10:00 AM",
                    fontSize = 15.sp,
                    color = CampusDarkBlue
                )

                Text(
                    text = "   •   Aula 204",
                    fontSize = 15.sp,
                    color = CampusDarkBlue.copy(alpha = 0.80f)
                )
            }
        }

        // Flecha lateral
        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .size(45.dp)
                .clip(CircleShape)
                .background(
                    Color.White.copy(alpha = 0.60f)
                )
                .border(
                    1.dp,
                    GlassBorder,
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = "Ver clase",
                tint = CampusDarkBlue,
                modifier = Modifier.size(28.dp)
            )
        }
    }
}


// ============================================================
// ACCESOS RÁPIDOS
// ============================================================

@Composable
fun AccesosRapidos() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        AccesoItem(
            icon = Icons.Default.Book,
            texto = "Cursos"
        )

        AccesoItem(
            icon = Icons.Default.Assignment,
            texto = "Tareas"
        )

        AccesoItem(
            icon = Icons.Default.CalendarMonth,
            texto = "Horario"
        )

        AccesoItem(
            icon = Icons.Default.ShowChart,
            texto = "Notas"
        )
    }
}


// ============================================================
// ITEM DE ACCESO
// ============================================================

@Composable
fun AccesoItem(
    icon: ImageVector,
    texto: String
) {

    Box(
        modifier = Modifier
            .width(78.dp)
            .height(105.dp)
            .shadow(
                elevation = 12.dp,
                shape = RoundedCornerShape(23.dp),
                ambientColor = CampusBlue.copy(alpha = 0.20f),
                spotColor = CampusBlue.copy(alpha = 0.20f)
            )
            .clip(
                RoundedCornerShape(23.dp)
            )
            .background(
                Color.White.copy(alpha = 0.62f)
            )
            .border(
                width = 1.2.dp,
                color = GlassBorder,
                shape = RoundedCornerShape(23.dp)
            ),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(
                modifier = Modifier
                    .size(46.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(
                        Brush.linearGradient(
                            colors = listOf(
                                CampusBlue.copy(alpha = 0.90f),
                                CampusBlue.copy(alpha = 0.55f)
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = icon,
                    contentDescription = texto,
                    tint = Color.White,
                    modifier = Modifier.size(27.dp)
                )
            }

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                text = texto,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = CampusDarkBlue
            )
        }
    }
}


// ============================================================
// RENDIMIENTO ACADÉMICO
// ============================================================

@Composable
fun RendimientoAcademico() {

    GlassCard(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
    ) {

        Column {

            Text(
                text = "Rendimiento académico",
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold,
                color = CampusDarkBlue
            )

            Spacer(
                modifier = Modifier.height(15.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                // PROMEDIO

                Box(
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape)
                        .border(
                            width = 8.dp,
                            color = CampusBlue,
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "4.2",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = CampusDarkBlue
                    )
                }

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Column {

                    Text(
                        text = "Promedio general",
                        fontSize = 13.sp,
                        color = CampusDarkBlue.copy(alpha = 0.75f)
                    )

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    Row(
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.spacedBy(7.dp)
                    ) {

                        BarraNota(35.dp)
                        BarraNota(55.dp)
                        BarraNota(75.dp)
                        BarraNota(95.dp)
                        BarraNota(65.dp)
                    }
                }
            }
        }

        Icon(
            imageVector = Icons.Default.ChevronRight,
            contentDescription = "Ver rendimiento",
            tint = CampusDarkBlue,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(27.dp)
        )
    }
}


// ============================================================
// BARRAS DEL GRÁFICO
// ============================================================

@Composable
fun BarraNota(
    altura: androidx.compose.ui.unit.Dp
) {

    Box(
        modifier = Modifier
            .width(13.dp)
            .height(altura)
            .clip(
                RoundedCornerShape(
                    topStart = 8.dp,
                    topEnd = 8.dp
                )
            )
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        CampusBlue,
                        CampusBlue.copy(alpha = 0.55f)
                    )
                )
            )
    )
}


// ============================================================
// TARJETA MOTIVACIONAL
// ============================================================

@Composable
fun TarjetaMotivacional() {

    GlassCard(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(58.dp)
                    .clip(CircleShape)
                    .background(
                        CampusBlue.copy(alpha = 0.15f)
                    ),
                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = Icons.Default.School,
                    contentDescription = "Estudio",
                    tint = CampusBlue,
                    modifier = Modifier.size(31.dp)
                )
            }

            Spacer(
                modifier = Modifier.width(15.dp)
            )

            Column {

                Text(
                    text = "“La disciplina de hoy,”",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    color = CampusDarkBlue
                )

                Text(
                    text = "“construye el éxito de mañana”",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    color = CampusDarkBlue
                )

                Spacer(
                    modifier = Modifier.height(7.dp)
                )

                Box(
                    modifier = Modifier
                        .width(38.dp)
                        .height(3.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(CampusBlue)
                )
            }
        }
    }
}


// ============================================================
// GLASS CARD
// ============================================================

@Composable
fun GlassCard(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {

    Box(
        modifier = modifier
            .shadow(
                elevation = 18.dp,
                shape = RoundedCornerShape(30.dp),
                ambientColor = CampusBlue.copy(alpha = 0.20f),
                spotColor = CampusDarkBlue.copy(alpha = 0.18f)
            )
            .clip(
                RoundedCornerShape(30.dp)
            )
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color.White.copy(alpha = 0.70f),
                        Color.White.copy(alpha = 0.43f),
                        Color.White.copy(alpha = 0.57f)
                    )
                )
            )
            .border(
                width = 1.5.dp,
                color = GlassBorder,
                shape = RoundedCornerShape(30.dp)
            )
            .padding(20.dp),
        content = content
    )
}


// ============================================================
// ICONO GLASS
// ============================================================

@Composable
fun GlassIcon(
    icon: ImageVector
) {

    Box(
        modifier = Modifier
            .size(43.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(
                CampusBlue.copy(alpha = 0.16f)
            )
            .border(
                1.dp,
                Color.White.copy(alpha = 0.75f),
                RoundedCornerShape(14.dp)
            ),
        contentAlignment = Alignment.Center
    ) {

        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = CampusBlue,
            modifier = Modifier.size(26.dp)
        )
    }
}


// ============================================================
// BARRA DE NAVEGACIÓN
// ============================================================

@Composable
fun BarraNavegacion() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(82.dp)
            .padding(
                start = 15.dp,
                end = 15.dp,
                bottom = 10.dp
            )
            .shadow(
                elevation = 20.dp,
                shape = RoundedCornerShape(30.dp),
                ambientColor = CampusBlue.copy(alpha = 0.20f),
                spotColor = CampusDarkBlue.copy(alpha = 0.18f)
            )
            .clip(
                RoundedCornerShape(30.dp)
            )
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        Color.White.copy(alpha = 0.72f),
                        Color.White.copy(alpha = 0.52f),
                        Color.White.copy(alpha = 0.72f)
                    )
                )
            )
            .border(
                width = 1.5.dp,
                color = GlassBorder,
                shape = RoundedCornerShape(30.dp)
            )
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {

        NavegacionItem(
            icon = Icons.Default.Home,
            texto = "Inicio",
            activo = true
        )

        NavegacionItem(
            icon = Icons.Default.Book,
            texto = "Cursos"
        )

        NavegacionItem(
            icon = Icons.Default.CalendarMonth,
            texto = "Horario"
        )

        NavegacionItem(
            icon = Icons.Default.Assignment,
            texto = "Tareas"
        )

        NavegacionItem(
            icon = Icons.Default.Person,
            texto = "Perfil"
        )
    }
}


// ============================================================
// ITEM NAVEGACIÓN
// ============================================================

@Composable
fun NavegacionItem(
    icon: ImageVector,
    texto: String,
    activo: Boolean = false
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = if (activo) {

                Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.linearGradient(
                            colors = listOf(
                                CampusBlue,
                                CampusBlue.copy(alpha = 0.75f)
                            )
                        )
                    )

            } else {

                Modifier
                    .size(42.dp)
            },

            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = icon,
                contentDescription = texto,
                tint = if (activo) {
                    Color.White
                } else {
                    CampusDarkBlue.copy(alpha = 0.80f)
                },
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(
            modifier = Modifier.height(2.dp)
        )

        Text(
            text = texto,
            fontSize = 10.sp,
            fontWeight = if (activo) {
                FontWeight.Bold
            } else {
                FontWeight.Normal
            },
            color = if (activo) {
                CampusBlue
            } else {
                CampusDarkBlue.copy(alpha = 0.80f)
            }
        )
    }
}