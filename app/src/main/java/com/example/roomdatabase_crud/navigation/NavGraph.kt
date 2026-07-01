package com.example.roomdatabase_crud.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.roomdatabase_crud.TaskViewModel
import com.example.roomdatabase_crud.ui.AddEditTaskScreen
import com.example.roomdatabase_crud.ui.TaskListScreen

@Composable
fun NavGraph(navController: NavHostController, viewModel: TaskViewModel) {
    NavHost(navController = navController, startDestination = "task_list") {
        composable("task_list") {
            TaskListScreen(
                viewModel = viewModel,
                onNavigateToAddEdit = { taskId ->
                    navController.navigate("add_edit_task?taskId=$taskId")
                }
            )
        }
        composable(
            route = "add_edit_task?taskId={taskId}",
            arguments = listOf(
                navArgument("taskId") {
                    type = NavType.IntType
                    defaultValue = -1
                }
            )
        ) { backStackEntry ->
            val taskId = backStackEntry.arguments?.getInt("taskId") ?: -1
            AddEditTaskScreen(
                taskId = taskId,
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}
