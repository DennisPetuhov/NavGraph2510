import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgraph2510.navigator.BaseViewModel
import com.example.navgraph2510.navigator.NavigationCommand
import java.beans.IndexedPropertyChangeEvent

open class BaseFragment : Fragment() {

    private fun handleNavigation(navCommand: NavigationCommand) {
        when (navCommand) {
            is NavigationCommand.ToDirection -> findNavController().navigate(navCommand.directions)
            is NavigationCommand.Back -> findNavController().navigateUp()
            is NavigationCommand.Null-> null
            else -> throw Exception()
        }
    }

    fun observeNavigation(viewModel: BaseViewModel) {
        viewModel.navigation.observe(viewLifecycleOwner) {

            handleNavigation(it)

        }
    }

}